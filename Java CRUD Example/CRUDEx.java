import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class CRUDEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEntryForm frm=new StudentEntryForm("Student Entry Form");
		frm.setVisible(true);

	}

}

class StudentEntryForm extends JFrame
{
	private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreateNew;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtClass;
    private javax.swing.JFormattedTextField txtDOB;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtRollNo;
    private javax.swing.JTextField txtStudentName;
    
    
	StudentEntryForm(String title)
	{
		super(title);
		this.setSize(450, 300);
		initComponents();
		
	}
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
		setLayout(null);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds( 3, 12,  100, 10);
        add(jLabel1);
        
        txtID = new javax.swing.JTextField();
        txtID.setBounds(112,10,50,20);
        add(txtID);
        
        jLabel2 = new javax.swing.JLabel();
        add(jLabel2);
        jLabel2.setBounds(3,42,100,10);
                
        txtStudentName = new javax.swing.JTextField();
        add(txtStudentName);
        txtStudentName.setBounds(112,40, 200,20);
        
        jLabel3 = new javax.swing.JLabel();
        add(jLabel3);
        jLabel3.setBounds(3,72,100,10);
        
        txtRollNo = new javax.swing.JTextField();
        add(txtRollNo);
        txtRollNo.setBounds(112,70,80,20);
        
        jLabel4 = new javax.swing.JLabel();
        add(jLabel4);
        jLabel4.setBounds(210,72,50,10);
        
        txtClass = new javax.swing.JTextField();
        add(txtClass);
        txtClass.setBounds(260,70,100,20);
        
        jLabel5 = new javax.swing.JLabel();
        add(jLabel5);
        jLabel5.setBounds(3, 102, 100, 10);
        
        txtDOB = new javax.swing.JFormattedTextField();
        add(txtDOB);
        txtDOB.setBounds(112, 100, 150, 20);
        
        jLabel6 = new javax.swing.JLabel();
        add(jLabel6);
        jLabel6.setBounds(3, 132, 100, 10);
        
        txtAddress = new javax.swing.JTextField();
        add(txtAddress );
        txtAddress.setBounds(112, 130, 250, 20);
                
        btnCreateNew = new javax.swing.JButton();
        add(btnCreateNew);
        btnCreateNew.setBounds(10,160, 100, 25);
        
        btnUpdate = new javax.swing.JButton();
        add(btnUpdate);
        btnUpdate.setBounds(115, 160, 75, 25);
        
        btnDelete = new javax.swing.JButton();
        add(btnDelete);
        btnDelete.setBounds(195,160,75,25);
        
        btnFind = new javax.swing.JButton();
        add(btnFind);
        btnFind.setBounds(275, 160, 75, 25);
        
        btnCancel = new javax.swing.JButton();
        add(btnCancel);
        btnCancel.setBounds(355,160,75,25);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student ID:");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        jLabel2.setText("Student Name :");

        jLabel3.setText("Roll No :");

        jLabel4.setText("Class :");

        jLabel5.setText("Date of Birth:");
        
        txtDOB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));

        jLabel6.setText("Address :");

        btnCreateNew.setText("Create New");
        btnCreateNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewActionPerformed(evt);
            }
        });
        
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Reset");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        
	}// </editor-fold>                        
	
	private void btnCreateNewActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        if(txtID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Invalid ID");
            return;
        }
        
        if(txtStudentName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter Student Name");
            return;
        }
        PreparedStatement stmt=null;
        Connection con=null; 
        try
        {
        
        con=getConnection();
        stmt=con.prepareStatement("Insert into tbStudentInfo (StudentID,Name,RollNo,Class,DOB,Address) values(?,?,?,?,?,?)");    
        stmt.setInt(1, Integer.parseInt(txtID.getText()));
        stmt.setString(2,txtStudentName.getText());
        stmt.setInt(3,Integer.parseInt(txtRollNo.getText()));
        stmt.setString(4,txtClass.getText());
        stmt.setString(5,txtDOB.getText());
        stmt.setString(6,txtAddress.getText());
        int a;
            a = stmt.executeUpdate();
        if (a>0)
            JOptionPane.showMessageDialog(this, "Record Saved Successfully");
            ClearAll();
        }
        catch( java.sql.SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        finally
        {
            try{if(stmt!=null) stmt.close();}
            catch(Exception e1)
            {
                e1.printStackTrace();
            }
            try{if(con!=null) con.close();}
            catch(Exception e1)
            {
                e1.printStackTrace();
            }                
        }
    }
	
    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {                               
        // TODO add your handling code here:
         char c=(char)evt.getKeyChar();
        if (!((c>='0'&&c<='9')||(c==java.awt.event.KeyEvent.VK_BACK_SPACE) ||(c==java.awt.event.KeyEvent.VK_BACK_SPACE)))
        {
                evt.consume();
                //JOptionPane.showMessageDialog(this, "Hello");
        }
       
    }                              

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        try
        {
            con=getConnection();
            stmt=con.prepareCall("select * from tbStudentInfo where StudentID=?");
            stmt.setInt(1,Integer.parseInt(txtID.getText()));
            rs=stmt.executeQuery();
            int i=0;
            while(rs.next())
            {
                txtStudentName.setText(rs.getString("Name"));
                txtRollNo.setText(rs.getString("RollNo"));
                txtClass.setText(rs.getString("Class"));
                txtDOB.setText(rs.getString("DOB"));
                txtAddress.setText(rs.getString("Address"));
                i++;
            }
            if (i==0)
            {
                JOptionPane.showMessageDialog(this, "Can't Find the records");
                ClearAll();
            }
            
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.toString());
        }
        finally
        {
            try{if(stmt!=null) stmt.close();}
            catch(Exception e1)
            {
                e1.printStackTrace();
            }
            try{if(con!=null) con.close();}
            catch(Exception e1)
            {
                e1.printStackTrace();
            }                
        }
    }                                       

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(txtID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Invalid ID");
            return;
        }
        
        if(txtStudentName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter Student Name");
            return;
        }
        PreparedStatement stmt=null;
        Connection con=null; 
        try
        {
        
        con=getConnection();
        stmt=con.prepareStatement("update tbStudentInfo set Name=?,RollNo=?,Class=?,DOB=?,Address=? where studentid=? ");    
        
        stmt.setString(1,txtStudentName.getText());
        stmt.setInt(2,Integer.parseInt(txtRollNo.getText()));
        stmt.setString(3,txtClass.getText());
        stmt.setString(4,txtDOB.getText());
        stmt.setString(5,txtAddress.getText());
        stmt.setInt(6, Integer.parseInt(txtID.getText()));
        int a;
            a = stmt.executeUpdate();
        if (a>0)
            JOptionPane.showMessageDialog(this, "Record Saved Successfully");
            ClearAll();
        }
        catch( java.sql.SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        finally
        {
            try{if(stmt!=null) stmt.close();}
            catch(Exception e1)
            {
                e1.printStackTrace();
            }
            try{if(con!=null) con.close();}
            catch(Exception e1)
            {
                e1.printStackTrace();
            }                
        }
        
    }                                         

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Are you sure to delete?","Delete",JOptionPane.YES_OPTION)==0)
        {
            PreparedStatement stmt=null;
        Connection con=null; 
        try
        {
        
        con=getConnection();
        stmt=con.prepareStatement("delete tbStudentInfo  where studentid=? ");    
        stmt.setInt(1, Integer.parseInt(txtID.getText()));
        int a;
            a = stmt.executeUpdate();
        if (a>0)
            JOptionPane.showMessageDialog(this, "Record Deleted successfully");
            ClearAll();
        }
        catch( java.sql.SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        finally
        {
            try{if(stmt!=null) stmt.close();}
            catch(Exception e1)
            {
                e1.printStackTrace();
            }
            try{if(con!=null) con.close();}
            catch(Exception e1)
            {
                e1.printStackTrace();
            }                
        }
            
        }
    }                                         

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        ClearAll();
    }                                         

    private void ClearAll()
    {
            txtID.setText("");
            txtStudentName.setText("");
            txtAddress.setText("");
            txtDOB.setText("");
            txtRollNo.setText("");
            txtClass.setText("");
    }
    
    public Connection getConnection()
    {
        String connectionUrl = "jdbc:sqlserver://localhost;" +
			"instancename=pecdata;databaseName=dbStudent;";
        Connection con;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl,"sa","pecdata");
            return con;
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
          return null;
        }
        
    }

}