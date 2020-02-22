package io.github.vooki.decoratus;

import io.github.vooki.decoratus.common.objects.item.Items;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DecoratusMod implements ModInitializer
{

	public static final ItemGroup DECORATUS_ITEMS = FabricItemGroupBuilder.create
			(
				new Identifier("decoratus", "decoratus_items"))
				.icon(() -> new ItemStack(Items.BASALT_BRICK))
				.build();

	@Override
	public void onInitialize()
	{
		Items.init();
	}
}
