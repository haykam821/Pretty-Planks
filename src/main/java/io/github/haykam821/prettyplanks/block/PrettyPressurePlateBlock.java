package io.github.haykam821.prettyplanks.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.PressurePlateBlock;

public class PrettyPressurePlateBlock extends PressurePlateBlock {
	public PrettyPressurePlateBlock(MaterialColor color) {
		super(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).materialColor(color).build());
	}
}