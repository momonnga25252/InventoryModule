 package jp.momonnga.spigot.module.inventory;

import org.bukkit.inventory.ItemStack;

public class InventoryDecoration extends CustomInventory {

    public InventoryDecoration (CustomInventory editor) {
        super(editor);
    }

    public void drawVerticalLine(int x ,ItemStack itemStack){
        for(int y = 0;;y++) {
            if(x + (9 * y) > super.getSize()) break;
            super.setItem(x,y,itemStack.clone());
        }
    }

    public void drawHorizontalLine(int y,ItemStack itemStack){
        for(int i = 0;i < 9;i++){
            super.setItem(i,y,itemStack.clone());
        }
    }

    public void drawEdgeLine(ItemStack itemStack){
        drawHorizontalLine(0,itemStack);
        drawHorizontalLine(8,itemStack);
        drawVerticalLine(0,itemStack);
        drawVerticalLine( (super.getSize()+1)/ 9,itemStack);
    }

}
