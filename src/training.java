import java.util.Random;

public class training {
    class point {
        float x;
        float y;
        int label;

        point() {
            x = Random(width);
            y = Random(height);

            if (x > y) {
                label = 1;
            } else {
                label = -1;
            }
        }
        void show(){
            stroke(0);
            if(label == 1){
                fill(255){
            }else{
                    fill(0);
                }
        }
    }
}
