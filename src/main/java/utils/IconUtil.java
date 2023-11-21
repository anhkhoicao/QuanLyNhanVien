package utils;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IconUtil {
    public static void setIconToLabel(File iconFile, JLabel label){
        try {
            URL url = iconFile.toURI().toURL();
            ImageIcon icon = new ImageIcon(url);
            Image image = icon.getImage();
            int width = label.getSize().width;
            int height = label.getSize().height;
            Image newImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImage);

            label.setIcon(newIcon);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    public static File copyFileToStorageFolder(File file, File folder) {
        if(!folder.isDirectory()){
            folder.mkdirs();
        }
        File newFile = new File(folder, file.getName());
        byte[] data = IconUtil.readData(file);
        IconUtil.writeData(newFile, data);
        return newFile;
    }

    public static byte[] readData(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            fis.close();
            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeData(File newFile, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(newFile);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
