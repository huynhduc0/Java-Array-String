package hm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class THDuc_17IT3_arrayex extends JFrame {

	private JPanel contentPane;
	private JTextField tfnguon;
	private JTextField tfkq;
	String [] mangchuoi;
	 int [] mangnguyen= new int[50];
	 private JTextField tfTim;
	 private JTextField tfmang2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrayex frame = new arrayex();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public arrayex() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp M\u1EA3ng");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 10, 79, 35);
		contentPane.add(lblNewLabel);
		
		tfnguon = new JTextField();
		tfnguon.setBounds(94, 19, 320, 19);
		contentPane.add(tfnguon);
		tfnguon.setColumns(10);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKtQu.setBounds(10, 96, 79, 19);
		contentPane.add(lblKtQu);
		
		tfkq = new JTextField();
		tfkq.setEditable(false);
		tfkq.setBounds(94, 98, 320, 19);
		contentPane.add(tfkq);
		tfkq.setColumns(10);
		
		JButton btnSpXpMng = new JButton("S\u1EAFp x\u1EBFp m\u1EA3ng t\u0103ng d\u1EA7n");
		btnSpXpMng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				getmang(tfnguon.getText());
				Sapxep(mangnguyen,mangchuoi.length);
				tfkq.setText(setkq(mangnguyen, mangchuoi.length));
			}
				catch(NumberFormatException e) {
					tfkq.setText("Vui lòng nhập lại mảng, mỗi số cách nhau bằng dấu ,");
				}
			}
		});
		btnSpXpMng.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSpXpMng.setBounds(10, 153, 198, 35);
		contentPane.add(btnSpXpMng);
		
		JButton btnSNhNht = new JButton("S\u1ED1 nh\u1ECF nh\u1EA5t");
		btnSNhNht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				getmang(tfnguon.getText());
				tfkq.setText(String.valueOf(min(mangnguyen,mangchuoi.length)));
			}
			catch(NumberFormatException e) {
				tfkq.setText("Vui lòng nhập lại mảng, mỗi số cách nhau bằng dấu ,");
			}
		}
		});
		btnSNhNht.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSNhNht.setBounds(218, 153, 124, 35);
		contentPane.add(btnSNhNht);
		
		JButton btnSLnNht = new JButton("S\u1ED1 l\u1EDBn nh\u1EA5t");
		btnSLnNht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				getmang(tfnguon.getText());
				tfkq.setText(String.valueOf(max(mangnguyen,mangchuoi.length)));
			}
			catch(NumberFormatException e) {
				tfkq.setText("Vui lòng nhập lại mảng, mỗi số cách nhau bằng dấu ,");
			}
		}
		});
		btnSLnNht.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSLnNht.setBounds(352, 153, 124, 35);
		contentPane.add(btnSLnNht);
		
		JLabel lblTmSTrong = new JLabel("T\u00ECm S\u1ED1 Trong M\u1EA3ng");
		lblTmSTrong.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTmSTrong.setBounds(10, 217, 134, 35);
		contentPane.add(lblTmSTrong);
		
		tfTim = new JTextField();
		tfTim.setColumns(10);
		tfTim.setBounds(146, 226, 238, 19);
		contentPane.add(tfTim);
		
		JButton btnTm = new JButton("T\u00ECm");
		btnTm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				getmang(tfnguon.getText());
				}
				catch(NumberFormatException e) {
					tfkq.setText("Vui lòng nhập lại mảng, mỗi số cách nhau bằng dấu ,");
				}
			try {
				tfkq.setText(String.valueOf(tim(mangnguyen,mangchuoi.length,Integer.parseInt(tfTim.getText()))));
			}
			
			catch(NumberFormatException ex) {
				tfkq.setText("Vui lòng nhập lại số cần tìm");
			}
		}
		});
		btnTm.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTm.setBounds(427, 217, 124, 35);
		contentPane.add(btnTm);
		
		JButton btnTngMng = new JButton("T\u1ED5ng m\u1EA3ng");
		btnTngMng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				getmang(tfnguon.getText());
				tfkq.setText(String.valueOf(tong(mangnguyen,mangchuoi.length)));
			}
				catch(NumberFormatException e) {
					tfkq.setText("Vui lòng nhập lại mảng, mỗi số cách nhau bằng dấu ,");
				}
			}
		});
		btnTngMng.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTngMng.setBounds(500, 153, 124, 35);
		contentPane.add(btnTngMng);
		
		JLabel lblNhpMngTh = new JLabel("Nhập Mảng Thứ 2");
		lblNhpMngTh.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNhpMngTh.setBounds(10, 280, 114, 35);
		contentPane.add(lblNhpMngTh);
		
		tfmang2 = new JTextField();
		tfmang2.setColumns(10);
		tfmang2.setBounds(146, 289, 238, 19);
		contentPane.add(tfmang2);
		
		JButton btnTmPhnT = new JButton("Tìm phần tử chung 2 mảng");
		btnTmPhnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String kq = null;
				kq="";
					try {
				getmang(tfnguon.getText());
					}
					catch(NumberFormatException e) {
						tfkq.setText("Vui lòng nhập lại mảng, mỗi số cách nhau bằng dấu \",\'");
					}
				String[] mangchuoi2=tfmang2.getText().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
				for( int i=0;i<mangchuoi.length;i++) 
				 for (int j=0;j<mangchuoi2.length;j++) {
					 try {
					 if(Integer.parseInt(mangchuoi2[j])==mangnguyen[i])
						 kq=kq+mangchuoi2[j]+", ";
				tfkq.setText(kq);
				}
				catch(NumberFormatException ex) {
					tfkq.setText("Nhập lại mảng 2, mỗi số cách nhau bằng dấu \" ,\"");
				}
			}
			}
			
		});
		btnTmPhnT.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTmPhnT.setBounds(427, 280, 198, 35);
		contentPane.add(btnTmPhnT);
	}

public void getmang(String a){
	mangchuoi = a.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
	for( int i=0;i<mangchuoi.length;i++) 
		mangnguyen[i]=Integer.parseInt(mangchuoi[i]);
	tfkq.setText("Nhập lại mảng, mỗi phần tử cách nhau bởi dấu ,");
}
public static int min(int a[], int x) {
	int m=a[0];
	for (int i=0;i<x;i++)
		if(a[i]<m) m=a[i];
	return m;
}
public static int max(int a[], int x) {
	int m=a[0];
	for (int i=0;i<x;i++)
		if(a[i]>m) m=a[i];
	return m;
}
public int tong(int a[], int x){
	int s=0;
	for(int i=0;i<x;i++)
		s=s+a[i];
	return s;
}
public String tim(int a[], int x, int t) {
	String kq = null;
	kq="";
	for (int i=0;i<x;i++)
		if(a[i]==t) 
			return kq=kq+"Mảng có chứa "+String.valueOf(t);
	return kq=kq+"Mảng không có chứa "+String.valueOf(t);
	
}
public static void Sapxep(int a[],int x) {
	for(int i=0;i<x;i++) 
		for(int j=i+1;j<x;j++) {
			if(a[i]>a[j]) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
		}
}
public static String setkq(int a[],int x) {
	String tam = null;
	 tam="";
	for (int i=0;i<x;i++) {
		if(i<x-1)
		tam=tam+String.valueOf(a[i]+", ");
		else 	tam=tam+String.valueOf(a[i]);
	}
	return tam;
}
}