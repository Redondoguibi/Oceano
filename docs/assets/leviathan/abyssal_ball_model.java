// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class abyssal_ball<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "abyssal_ball"), "main");
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart charge;
	private final ModelPart root_outline;

	public abyssal_ball(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.charge = this.root.getChild("charge");
		this.root_outline = root.getChild("root_outline");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.5F, -4.75F, -7.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-8.0F, -4.25F, -7.0F, 15.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.5F, -22.75F, 6.5F));

		PartDefinition charge = root.addOrReplaceChild("charge", CubeListBuilder.create().texOffs(60, 32).addBox(-9.5F, 2.25F, 9.5F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 44).addBox(-9.5F, 2.25F, -10.5F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.5F, -22.75F, 6.5F));

		PartDefinition cube_r1 = charge.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 40).addBox(-17.0F, -2.0F, -1.0F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.5F, 4.25F, -7.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = charge.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 36).addBox(-17.0F, -2.0F, -1.0F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.5F, 4.25F, -7.75F, 0.0F, 1.5708F, 0.0F));

		PartDefinition root_outline = partdefinition.addOrReplaceChild("root_outline", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -10.5F, 16.0F, -18.0F, -18.0F, -18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.5F, -11.0F, 15.5F, -17.0F, -17.0F, -17.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -17.5F, 19.0F, -20.0F, -4.0F, -4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -17.5F, -1.0F, -20.0F, -4.0F, -4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_outline_r1 = root_outline.addOrReplaceChild("cube_outline_r1", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, 1.0F, 2.0F, -20.0F, -4.0F, -4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.0F, -18.5F, -1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_outline_r2 = root_outline.addOrReplaceChild("cube_outline_r2", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, 1.0F, 2.0F, -20.0F, -4.0F, -4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -18.5F, -1.25F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		root_outline.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}