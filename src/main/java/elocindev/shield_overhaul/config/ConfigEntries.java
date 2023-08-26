package elocindev.shield_overhaul.config;

import java.util.ArrayList;
import java.util.List;

public class ConfigEntries {
  public List<String> blacklisted_shields = new ArrayList<>();
  public boolean bosses_immune_to_stun = true;
  public boolean bash_only_on_ground = true;
  public float bash_damage = 0.0F;
  public float bash_cooldown_secs = 3.0F;
  public float bash_stun_duration_secs = 1.0F;
  public boolean add_stun_immunity = true;
}
