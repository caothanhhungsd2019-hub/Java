package stt16_24646681_CaoThanhHung_Gk1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GiaoDien1 extends JFrame implements ActionListener, MouseListener{
	private JTextField txtTen;
	private JTextField txtThang;
	private JTextField txtDiaChi;
	private JComboBox<String> cbDoiTuong;
	private DefaultTableModel modelVeXe;
	private JTable tableVeXe;
	private JTextField txtNhapMa;
	private JButton btnLuu;
	private JButton btnLamMoi;
	private JButton btnThem;
	private JButton btnTim;
	private JButton btnXoa;
	private JTextField txtMa;

	public GiaoDien1() {
		setTitle("Kiểm tra giữa kì Java hướng sự kiện - 24646681 - Cao Thanh Hùng");
		setSize(1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		
		
		JPanel pMain, pNorth, pCenter, pSouth;
		pMain = new JPanel();
		pMain.setLayout(new BorderLayout());
		pMain.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		add(pMain);
		Dimension size = new Dimension(150, 25);
		
		// Xử lý vùng phía Bắc
		pNorth = new JPanel();
		pNorth.setLayout(new BorderLayout());
		JPanel pNNorth = new JPanel();
		JLabel lblTitle = new JLabel("QUẢN LÝ BÁN VÉ XE BUÝT");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 26));
		lblTitle.setForeground(Color.BLUE);
		pNNorth.add(lblTitle);
		
		
		JPanel pNCenter = new JPanel();
		pNCenter.setLayout(new BoxLayout(pNCenter, BoxLayout.Y_AXIS));
		
		Box bMa = Box.createHorizontalBox();
		JLabel lblMa = new JLabel("Mã khách hàng: ");
		lblMa.setPreferredSize(size);
		txtMa = new JTextField(20);
		bMa.add(lblMa);
		bMa.add(txtMa);
		pNCenter.add(bMa);
		pNCenter.add(Box.createVerticalStrut(10));
		
		
		Box bTen = Box.createHorizontalBox();
		JLabel lblTen = new JLabel("Tên khách hàng");
		lblTen.setPreferredSize(size);
		txtTen = new JTextField(20);
		JLabel lblThang = new JLabel("Số tháng đăng kí: ");
		txtThang = new JTextField(20);
		bTen.add(lblTen);
		bTen.add(txtTen);
		bTen.add(lblThang);
		bTen.add(txtThang);
		pNCenter.add(bTen);
		pNCenter.add(Box.createVerticalStrut(10));
		
		
		Box bDiaChi = Box.createHorizontalBox();
		JLabel lblDiaChi = new JLabel("Địa chỉ: ");
		lblDiaChi.setPreferredSize(size);
		txtDiaChi = new JTextField(20);
		bDiaChi.add(lblDiaChi);
		bDiaChi.add(txtDiaChi);
		pNCenter.add(bDiaChi);
		pNCenter.add(Box.createVerticalStrut(10));
		
		Box bDoiTuong = Box.createHorizontalBox();
		JLabel lblDoiTuong = new JLabel("Đối tượng: ");
		lblDoiTuong.setPreferredSize(size);
		String[] doiTuong = {"Ưu tiên", "Không ưu tiên"};
		cbDoiTuong = new JComboBox<String>(doiTuong);
		bDoiTuong.add(lblDoiTuong);
		bDoiTuong.add(cbDoiTuong);
		pNCenter.add(bDoiTuong);
		pNCenter.add(Box.createVerticalStrut(10));
		
		
		// Vùng giữa
		pCenter = new JPanel();
		pCenter.setLayout(new BorderLayout());
		
		String[] cot = {"Mã khách hàng", "Tên khách hàng", "Số tháng đăng kí", "Địa chỉ", "Đối tượng"};
		modelVeXe = new DefaultTableModel(cot,0) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		tableVeXe = new JTable(modelVeXe);
		JScrollPane scrBang = new JScrollPane(tableVeXe);
		pCenter.add(scrBang, BorderLayout.CENTER);
		
		// Vùng nam
		pSouth = new JPanel();
		JLabel lblNhapMa = new JLabel("Nhập mã KHÁCH HÀNG cần tìm: ");
		txtNhapMa = new JTextField(20);
		btnTim = new JButton("Tìm");
		btnThem = new JButton("Thêm");
		btnLamMoi = new JButton("Làm mới");
		btnXoa = new JButton("Xóa");
		btnLuu = new JButton("Lưu file");
		pSouth.add(lblNhapMa);
		pSouth.add(txtNhapMa);
		pSouth.add(btnTim);
		pSouth.add(btnThem);
		pSouth.add(btnLamMoi);
		pSouth.add(btnXoa);
		pSouth.add(btnLuu);
		
		
		pNorth.add(pNNorth, BorderLayout.NORTH);
		pNorth.add(pNCenter, BorderLayout.CENTER);
		pMain.add(pNorth, BorderLayout.NORTH);
		pMain.add(pCenter, BorderLayout.CENTER);
		pMain.add(pSouth, BorderLayout.SOUTH);
		
		btnTim.addActionListener(this);
		btnThem.addActionListener(this);
		btnLamMoi.addActionListener(this);
		btnXoa.addActionListener(this);
		btnLuu.addActionListener(this);
		tableVeXe.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		new GiaoDien1().setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btnThem)) {
			System.out.println("Bấm thêm");
		}
		else if (o.equals(btnXoa))
		{
			System.out.println("Bấm xóa");
		}
		else if(o.equals(btnTim)) {
			System.out.println("Bấm tìm");
		}
		else if(o.equals(btnLamMoi))
		{
			System.out.println("Bấm làm mới");
		}
		else if(o.equals(btnLuu)) {
			System.out.println("Bấm lưu");
		}
		
	}
	
}
