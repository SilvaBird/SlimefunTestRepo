package me.silvabird.silverslimefunaddon;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class WoodenFluidTank extends SlimefunItem {
    public WoodenFluidTank(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public void PreRegistor() {
        BlockUseHandler blockUseHandler = this::onBlockRightClick;
        addItemHandler(blockUseHandler);
    }


    private void onBlockRightClick(PlayerRightClickEvent e) {
        if e.getPlayer().getItemInUse() == Material.BUCKET {

        } else if e.getPlayer().getItemInUse() == Material.WATER_BUCKET{

        } else if e.getPlayer().getItemInUse() == Material.HONEY_BOTTLE{

        } else if e.getPlayer().getItemInUse() == Material.MILK_BUCKET{

        }
    }
}
