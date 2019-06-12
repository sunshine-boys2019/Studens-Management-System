package Operation;
import javax.swing.Timer;
import javax.swing.JLabel;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.text.DateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class GetDateTime implements ActionListener {
    public final int ONE_SECOND = 1000; //1秒钟更新一次
    private JLabel timeLabel = null; //在此label上显示时间由外部传入
    private Calendar calendar = null; //获取当前时间的日历类
    private DateFormat dateFormat = null; //时间格式类 用来格式化时间用
    private Timer timeTimer = null; //计时器
    private TimeZone currentTimeZone; //当前的时区
    public GetDateTime(JLabel jLabel) {
        this.timeLabel = jLabel;
        this.currentTimeZone = TimeZone.getDefault();//此方法返回本地时区程序运行的地方
        this.dateFormat = DateFormat.getDateTimeInstance(2, 2, Locale.getDefault());
        this.timeTimer = new Timer(this.ONE_SECOND, this);//实例化计时器对象
        this.timeTimer.setRepeats(true);//设置重复
        this.timeTimer.start();///启动计时器
    }


    public void stopTimer() {
        this.timeTimer.stop();
    }

    public void reStartTimer() {
        this.timeTimer.restart();
    }

    public void actionPerformed(ActionEvent arg0) {
        this.calendar = Calendar.getInstance(this.currentTimeZone);
        this.timeLabel.setText("当前系统时间："+this.dateFormat.format(this.calendar.getTime()));
 }
    public static void main(String[] args) {
        JFrame frame = new JFrame("ddsaf");
        JLabel lab = new JLabel();
        new GetDateTime(lab);
        frame.add(lab);
        frame.setSize(300, 50);
        frame.setVisible(true);
    }
 }
 //测试类
/*public class Demo {

    
}*/
