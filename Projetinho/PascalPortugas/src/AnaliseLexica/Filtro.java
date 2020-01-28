package AnaliseLexica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;

/**
 *
 * @author widim
 */
public class Filtro extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".pasc");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            //<editor-fold defaultstate="collapsed" desc="/*comment*/">
            
//</editor-fold>
    return "PASCAL script (*.pasc)";
        }
    } 
