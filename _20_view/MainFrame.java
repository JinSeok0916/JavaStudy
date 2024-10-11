package _20_view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import _20_JavaOracleTest.OpenIdeaDAO;
import _20_JavaOracleTest.OpenIdeaDTO;

public class MainFrame extends JFrame implements ActionListener{
										// 인터페이스 구현 - 기능을 처리하기 위해
	private JLabel title = new JLabel("OpenIdea");
	private JTextField input = new JTextField();
	private JButton btn = new JButton("Save");
	private List wordList = new List(5,false); 
	private JButton btn1 = new JButton("East");
	private JButton btn2 = new JButton("West");
	private JPanel centerP = new JPanel();
	// panel은 컨테이너이면서 컴포넌트이다. 기본 레이아웃이 flowLayout
	
	private OpenIdeaDAO ideaDAO = OpenIdeaDAO.DAO();
	public MainFrame() {
		this.setBounds(100, 100, 900, 900);
		// 컨테이너는 컴포넌트를 배치시킨다. 컨테이너는 레이아웃이 있다.
		// JFrame은 컨테이너이고, 기본 레이아웃은 border layout이다.
		// border layout은 하나의 공간에 하나의 컴포넌트만 가능하다.
		this.add(title,"North");
		this.add(btn,"South");
		// 가운데 패널
		centerP.setLayout(new BorderLayout());
		centerP.add(wordList,"Center");
		centerP.add(input,"South");
		this.add(centerP,"Center");
		
//		this.add(wordList,"Center");
//		this.add(btn,"Center");
//		this.add(btn1,"East");
//		this.add(btn2,"West");
		
		// 리스너 등록
		btn.addActionListener(this);
		input.addActionListener(this);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		loadDB();
	}
	private void loadDB() {
		ArrayList<OpenIdeaDTO> ideaDTO = ideaDAO.list();
		for (OpenIdeaDTO i : ideaDTO) {
			wordList.add(i.toString());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn || e.getSource() == input) {
			System.out.println("버튼이 클릭 됨");
			String t = input.getText();
			System.out.println("입력하신 글은 : "+t);
			input.setText("");
			wordList.add(t);
			
			OpenIdeaDTO DTO = new OpenIdeaDTO();
			DTO.setTitle(t);
			ideaDAO.suggest(DTO);
		}
	}
}
