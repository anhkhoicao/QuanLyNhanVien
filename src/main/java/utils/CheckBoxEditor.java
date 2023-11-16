/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author caube
 */
public class CheckBoxEditor extends AbstractCellEditor implements TableCellEditor {

    private JCheckBox checkBox;

    public CheckBoxEditor() {
        checkBox = new JCheckBox();
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                fireEditingStopped();
            }
        });
    }

    @Override
    public Object getCellEditorValue() {
         return checkBox.isSelected();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        checkBox.setSelected((Boolean) value);
        return checkBox;
    }

}
