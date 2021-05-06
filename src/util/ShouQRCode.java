package util;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * lsy create in 2021/05/06/20:35
 */
public class ShouQRCode {
   /* *//**
     * @param args
     *//*
    public static void main(String[] args) {

        String path = "C://Users//LSY66/Desktop/电子商城";

        List<File> list = getFileSort(path);

        for (File file : list) {
            System.out.println(file.getName() + " : " + file.lastModified());
        }
    }*/

    /**
     * 获取目录下所有文件(按时间排序)
     *
     * @param path
     * @return
     */
    public static List<File> getFileSort(String path) {

        List<File> list = getFiles(path, new ArrayList<File>());

        if (list != null && list.size() > 0) {

            Collections.sort(list, new Comparator<File>() {
                public int compare(File file, File newFile) {
                    if (file.lastModified() < newFile.lastModified()) {
                        return 0;
                    } else if (file.lastModified() > newFile.lastModified()) {
                        return 1;
                    } else {
                        return -1;
                    }

                }
            });

        }

        return list;
    }

    /**
     *
     * 获取目录下所有文件
     *
     * @param realpath
     * @param files
     * @return
     */
    public static List<File> getFiles(String realpath, List<File> files) {

        File realFile = new File(realpath);
        if (realFile.isDirectory()) {
            File[] subfiles = realFile.listFiles();
            for (File file : subfiles) {
                if(file.getName().endsWith(".png"))
                    files.add(file);
                }
            }

        return files;
    }
}
