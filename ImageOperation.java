import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ImageOperation {
    public void operate(int key){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();

        //To read data (FileInputStream)
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data =  new byte[fis.available()];
            fis.read(data);

            //Encryption/Decryption Logic
            int i = 0;
            System.out.println("Image data");
            for(byte b: data){
                System.out.println(b);
                data[i] = (byte) (b^key);
                i++;
            }
        
        //To write data (FileOuputStream)
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);

        //Closing input and output
        fos.close();
        fis.close();

        //MessageDialogBox
        JOptionPane.showMessageDialog(null, "Done");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
