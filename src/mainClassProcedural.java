import processing.core.PApplet;

public class mainClassProcedural extends PApplet {
    public static final int h=750;
    public static final int b=1000;
    public static final int r=20;
    int x=0;
    int x1=0;
    int x2=0;
    int x3=0;
    public static void main(String[] args)
    {
        PApplet.main("mainClassProcedural",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(b,h);
    }

    @Override
    public void draw() {
        drawCircle();
        drawCircle1();
        drawCircle2();
        drawCircle3();
    }

    private void drawCircle() {
        ellipse(x,h/5,r,r);
        x++;
    }
    private void drawCircle1() {
        ellipse(2*x1,2*(h/5),r,r);
        x1++;
    }
    private void drawCircle2() {
        ellipse(3*x2,3*(h/5),r,r);
        x2++;
    }
    private void drawCircle3() {
        ellipse(4*x3,4*(h/5),r,r);
        x3++;
    }
}
