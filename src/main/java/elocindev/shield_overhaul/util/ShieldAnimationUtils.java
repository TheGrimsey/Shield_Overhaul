package elocindev.shield_overhaul.util;

import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import elocindev.shield_overhaul.ShieldOverhaul;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class ShieldAnimationUtils {
    public static void playShieldBashAnimation(PlayerEntity user) {
        var animationContainer = ((IShieldAnimatedPlayer)user).shield_overhaul_getModAnimation();
        KeyframeAnimation anim = PlayerAnimationRegistry.getAnimation(new Identifier(ShieldOverhaul.MODID, "bashRight"));
        var builder = anim.mutableCopy();
        anim = builder.build();
        animationContainer.setAnimation(new KeyframeAnimationPlayer(anim));
        //Use animationContainer.replaceAnimationWithFade(); to create fading effects instead of sudden changes.
    }
}