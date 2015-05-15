
package animationtest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Export {
    
    public static void writeTextFile(String code, String filePath) throws FileNotFoundException{
        PrintWriter outFile = new PrintWriter(filePath);
        
        outFile.write(code);
        outFile.close();
    }

    public static void writeBinaryFile(String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
    }
    
    public static String pointsToString(){
        String out = "";
        
        for(int i = 0; i<FTCauto.points.size();  i++){
            out+= FTCauto.points.get(i).toString()+ "\n";
        }
        
        return(out);
    }

    public static PointArray fileToPoints(File f) {
        PointArray rtn = new PointArray();
        Scanner scan;

        try {
            scan = new Scanner(f);

            String aPoint;

            double x, y;
            String code;
            int speed;

            //as long as there are more points
            while (scan.hasNextLine()) {
                //put the line with the next point in a string for processing.
                aPoint = scan.nextLine();

                //extract the information about the point from the string
                x = Double.parseDouble(aPoint.substring(2, aPoint.indexOf(' ')));
                aPoint = aPoint.substring(aPoint.indexOf(' ') + 1);
                y = Double.parseDouble(aPoint.substring(2, aPoint.indexOf(' ')));
                aPoint = aPoint.substring(aPoint.indexOf('\"') + 1);
                code = aPoint.substring(0, aPoint.indexOf('\"'));
                aPoint = aPoint.substring(aPoint.indexOf('[') + 1);
                speed = Integer.parseInt(aPoint.substring(0, aPoint.indexOf(']')));

                //make a new point with the information extracted
                rtn.add(new Point(x, y, code, speed));
            }

            scan.close();
        } catch (FileNotFoundException e) {
            System.out.print("file not found!");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.print("Illegal file format!");
            e.printStackTrace();
            rtn.clear();
        }
        finally {
            return rtn;
        }
    }

    public static PointArray readFile(String path)
    {
        PointArray rtn = fileToPoints(new File(path));
        return rtn;
    }
    
}
