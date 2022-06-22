public class ResistorColorDuo {
    int value(String[] colors) {
        String[] resistorColors = {
            "black","brown","red","orange","yellow","green","blue","violet","grey","white"
        };
        int sum=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<resistorColors.length;j++){
                if(colors[0]==resistorColors[j]){
                    sum+=j*10;
                }
                if(colors[1]==resistorColors[j]){
                    sum+=j;
                }
            }
        }
        return sum;
    }
}
