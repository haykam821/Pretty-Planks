package io.github.haykam821.prettyplanks.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.WoodButtonBlock;

public class PrettyButtonBlock extends WoodButtonBlock {
	public PrettyButtonBlock(MaterialColor color) {
		super(FabricBlockSettings.copy(Blocks.OAK_BUTTON).materialColor(color).build());
	}
}