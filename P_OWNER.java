
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P_OWNER {
    
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int ID)
    {
        this.id = ID;
    }
    
    public String getFname()
    {
        return this.firstName;
    }
    
    public void setFname(String FNAME)
    {
       this.firstName = FNAME; 
    }
    
    public String getLname()
    {
        return this.lastName;
    }
    
    public void setLname(String LNAME)
    {
       this.lastName = LNAME; 
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public void setPhone(String PHONE)
    {
       this.phone = PHONE; 
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setEmail(String EMAIL)
    {
       this.email = EMAIL; 
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setAddress(String ADDRESS)
    {
       this.address = ADDRESS; 
    }
    
    
    public P_OWNER(){}
    
    public P_OWNER(int ID, String FNAME, String LNAME, String PHONE, String EMAIL, String ADDRESS)
    {
        this.id = ID;
        this.firstName = FNAME;
        this.lastName = LNAME;
        this.phone = PHONE;
        this.email = EMAIL;
        this.address = ADDRESS;
    }
    
    
    
    public boolean addNewOwner(P_OWNER owner)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `property_owner`(`fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setString(1, owner.getFname());
            ps.setString(2, owner.getLname());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAddress());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    
    public boolean editOwnerData(P_OWNER owner)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE `property_owner` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setString(1, owner.getFname());
            ps.setString(2, owner.getLname());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAddress());
            ps.setInt(6, owner.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
    public boolean deleteOwner(int ownerId)
    {
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `property_owner` WHERE `id`=?";
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, ownerId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
    
    
    public ArrayList<P_OWNER> ownersList()
    {
        ArrayList<P_OWNER> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `property_owner`";
        
        try {
            
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            P_OWNER owner;
            
            while (rs.next()) {
                
                owner = new P_OWNER(rs.getInt(1),
                                    rs.getString(2), 
                                    rs.getString(3),
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getString(6));
                
                list.add(owner);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
}
