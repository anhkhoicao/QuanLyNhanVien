package utils;

//import fastfood.icon.XIcon;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;

public class XFile {
//    public static final File PHOTO_DIR = new File("./photos");
//    public static final File IMAGE_DIR = new File("./images");
//    
//    public static File copyToPhotoDir(File source){
//        return XFile.copy(source, PHOTO_DIR);
//    }
//    public static File copyToImageDir(File source){
//        return XFile.copy(source, IMAGE_DIR);
//    }
//    public static File copy(File source, File storageDirectory){
//        if(!storageDirectory.isDirectory()){
//            storageDirectory.mkdirs();
//        }
//        File destination = new File(storageDirectory, source.getName());
//        byte[] data = XFile.read(source);
//        XFile.write(data, destination);
//        return destination;
//    }
//    
//    public static byte[] read(String path){
//        return XFile.read(new File(path));
//    }
//    public static byte[] read(File file){
//        try {
//            FileInputStream in = new FileInputStream(file);
//            byte[] data = new byte[in.available()];
//            in.read(data);
//            in.close();
//            return data;
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    
//    public static void write(byte[] data, String path){
//        XFile.write(data, new File(path));
//    }
//    public static void write(byte[] data, File file){
//        try {
//            FileOutputStream out = new FileOutputStream(file);
//            out.write(data);
//            out.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    
//    public static ImageIcon loadIcon(URL url){
//        return new ImageIcon(url);
//    }
//    public static ImageIcon loadIconFromFile(File file){
//        try {
//            URL url = file.toURI().toURL();
//            return XFile.loadIcon(url);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public static ImageIcon loadIconFromResource(String filename){
//        URL url = XIcon.class.getResource(filename);
//        return XFile.loadIcon(url);
//    }
    
    public static ImageIcon getScaledIcon(ImageIcon icon, int width, int height){
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(width, height,  Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);
    }
    
    
}