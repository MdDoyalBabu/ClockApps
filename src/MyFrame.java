import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {


    Calendar calendar;
    SimpleDateFormat timeFormate;
    SimpleDateFormat dayFormatFormate;
    SimpleDateFormat dateFormatFormate;
    JLabel timelabel;
    JLabel daylabel;
    JLabel datelabel;
    String time;
    String day;
    String date;


    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
         this.setResizable(false);

         // all format

        timeFormate=new SimpleDateFormat("hh:mm:ss a");
        dayFormatFormate=new SimpleDateFormat("EEE");
        dateFormatFormate=new SimpleDateFormat("MMMMM dd, yyyy");

        timelabel=new JLabel();
        timelabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timelabel.setForeground(new Color(0x00FF00));
        timelabel.setBackground(Color.black);
        timelabel.setOpaque(true);

        // jlabel

        daylabel=new JLabel();
        daylabel.setFont(new Font("Ink Free",Font.PLAIN,35));

        datelabel=new JLabel();
        datelabel.setFont(new Font("Ink Free",Font.PLAIN,35));


        // add dis item

        this.add(timelabel);
        this.add(daylabel);
        this.add(datelabel);

        this.setVisible(true);


        setTime();

    }
    public void setTime(){

        while (true){
            time=timeFormate.format(calendar.getInstance().getTime());
            timelabel.setText(time);

            day=dayFormatFormate.format(calendar.getInstance().getTime());
            daylabel.setText(day);

            date=dateFormatFormate.format(calendar.getInstance().getTime());
            datelabel.setText(date);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
