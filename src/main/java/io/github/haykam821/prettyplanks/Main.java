package io.github.haykam821.prettyplanks;

import io.github.haykam821.prettyplanks.block.PrettyStairsBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	private static String MOD_ID = "prettyplanks";

	public void registerDyedPlankType(String prefix, MaterialColor color) {
		// Planks
		Identifier planksID = new Identifier(MOD_ID, prefix + "_pretty_planks");
		Block planksBlock = Registry.register(Registry.BLOCK, planksID, new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).materialColor(color).build()));
		Registry.register(Registry.ITEM, planksID, new BlockItem(planksBlock, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		// Stairs
		Identifier stairsID = new Identifier(MOD_ID, prefix + "_pretty_stairs");
		Block stairsBlock = Registry.register(Registry.BLOCK, stairsID, new PrettyStairsBlock(planksBlock));
		Registry.register(Registry.ITEM, stairsID, new BlockItem(stairsBlock, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		// Slabs
		Identifier slabsID = new Identifier(MOD_ID, prefix + "_pretty_slab");
		Block slabsBlock = Registry.register(Registry.BLOCK, slabsID, new SlabBlock(FabricBlockSettings.copy(planksBlock).build()));
		Registry.register(Registry.ITEM, slabsID, new BlockItem(slabsBlock, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		// Fences
		Identifier fenceID = new Identifier(MOD_ID, prefix + "_pretty_fence");
		Block fenceBlock = Registry.register(Registry.BLOCK, fenceID, new FenceBlock(FabricBlockSettings.copy(planksBlock).build()));
		Registry.register(Registry.ITEM, fenceID, new BlockItem(fenceBlock, new Item.Settings().group(ItemGroup.DECORATIONS)));

		// Fence gates
		Identifier fenceGateID = new Identifier(MOD_ID, prefix + "_pretty_fence_gate");
		Block fenceGateBlock = Registry.register(Registry.BLOCK, fenceGateID, new FenceGateBlock(FabricBlockSettings.copy(planksBlock).build()));
		Registry.register(Registry.ITEM, fenceGateID, new BlockItem(fenceGateBlock, new Item.Settings().group(ItemGroup.REDSTONE)));
	}

	@Override
	public void onInitialize() {
		registerDyedPlankType("white", MaterialColor.WHITE);
		registerDyedPlankType("orange", MaterialColor.ORANGE);
		registerDyedPlankType("magenta", MaterialColor.MAGENTA);
		registerDyedPlankType("light_blue", MaterialColor.LIGHT_BLUE);
		registerDyedPlankType("yellow", MaterialColor.YELLOW);
		registerDyedPlankType("lime", MaterialColor.LIME);
		registerDyedPlankType("pink", MaterialColor.PINK);
		registerDyedPlankType("gray", MaterialColor.GRAY);
		registerDyedPlankType("light_gray", MaterialColor.LIGHT_GRAY);
		registerDyedPlankType("cyan", MaterialColor.CYAN);
		registerDyedPlankType("purple", MaterialColor.PURPLE);
		registerDyedPlankType("blue", MaterialColor.BLUE);
		registerDyedPlankType("brown", MaterialColor.BROWN);
		registerDyedPlankType("green", MaterialColor.GREEN);
		registerDyedPlankType("red", MaterialColor.RED);
		registerDyedPlankType("black", MaterialColor.BLACK);
	}
}