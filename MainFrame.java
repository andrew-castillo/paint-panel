package project4;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MainFrame extends JFrame {
	//Used class examples: https://classes.cs.uoregon.edu/17F/cis212/examples.htm//
	private final JButton _blackbutton;
	private final JButton _greenbutton;	
	private final JButton _bluebutton;
	private final JButton _redbutton;
	private final JButton _clearbutton;
	private final JButton _smallbutton;
	private final JButton _mediumbutton;	 
	private final JButton _largebutton;		
	
	public MainFrame() {
		JFrame application = new JFrame("Paint");
		PaintPanel mainPaintPanel = new PaintPanel();
		application.add(mainPaintPanel, BorderLayout.CENTER);
		application.setSize(1000, 800);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setVisible(true);
		JPanel sizebuttonPanel = new JPanel(new GridLayout(3,1));
		
		
		_smallbutton = new JButton("Small");
		sizebuttonPanel.add(_smallbutton);
		_smallbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				mainPaintPanel.setSize(2);
			}
		});
		
		_mediumbutton = new JButton("Medium");
		sizebuttonPanel.add(_mediumbutton);
		_mediumbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				mainPaintPanel.setSize(5);
			}
		});
		
		_largebutton = new JButton("Large");
		sizebuttonPanel.add(_largebutton);
		_largebutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				mainPaintPanel.setSize(10);
			}
		});
		
		application.add(sizebuttonPanel, BorderLayout.WEST);
		JPanel colorbuttonPanel = new JPanel(new GridLayout(4,1));
		
		_blackbutton = new JButton("Black");
		colorbuttonPanel.add(_blackbutton);
		_blackbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				mainPaintPanel.setGlobalColor(Color.BLACK);
			}
		});
		
		_redbutton = new JButton("Red");
		colorbuttonPanel.add(_redbutton);
		_redbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				mainPaintPanel.setGlobalColor(Color.RED);
			}
		});


		_greenbutton = new JButton("Green");
		colorbuttonPanel.add(_greenbutton);
		_greenbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				mainPaintPanel.setGlobalColor(Color.GREEN);
			}
		});
		
		_bluebutton = new JButton("Blue");
		colorbuttonPanel.add(_bluebutton);
		_bluebutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				mainPaintPanel.setGlobalColor(Color.BLUE);
			}
		});
		
		application.add(colorbuttonPanel,  BorderLayout.EAST);
		_clearbutton = new JButton("CLEAR");
		application.add(_clearbutton,  BorderLayout.SOUTH);
		_clearbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				mainPaintPanel.Clear();
			}
		});
	}
}