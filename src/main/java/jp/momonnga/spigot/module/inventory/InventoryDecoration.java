 package jp.momonnga.spigot.module.inventory;

import org.bukkit.inventory.ItemStack;

public class InventoryDecoration{

    private CustomInventory inventory;

    public InventoryDecoration(){}

    public InventoryDecoration (CustomInventory editor) {
        inventory = editor;
    }

    public CustomInventory getInventory() {
        return inventory;
    }

    public void drawVerticalLine(int x , ItemStack itemStack){
        for(int y = 0;;y++) {
            if(x + (9 * y) > inventory.getSize()) break;
            inventory.setItem(x,y,itemStack.clone());
        }
    }

    public void drawHorizontalLine(int y,ItemStack itemStack){
        for(int i = 0;i < 9;i++){
            inventory.setItem(i,y,itemStack.clone());
        }
    }

    public void drawEdgeLine(ItemStack itemStack){
        drawHorizontalLine(0,itemStack);
        drawHorizontalLine(8,itemStack);
        drawVerticalLine(0,itemStack);
        drawVerticalLine( (inventory.getSize()+1)/ 9,itemStack);
    }

}
