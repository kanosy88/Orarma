
package net.mcreator.billycool.item;

@Billycool1ModElements.ModElement.Tag
public class MudhoeItem extends Billycool1ModElements.ModElement {

	@ObjectHolder("billycool1:mudhoe")
	public static final Item block = null;

	public MudhoeItem(Billycool1ModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 20;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.DIRT, (int) (1)));
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("houe en boue"));
			}

		}.setRegistryName("mudhoe"));
	}

}
