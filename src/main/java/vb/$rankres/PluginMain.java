package vb.$rankres;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginManager().registerEvents(GUIManager.getInstance(), this);
		GUIManager.getInstance().register("ranksguiplugin", guiPlayer -> {
			try {
				org.bukkit.inventory.Inventory guiInventory = Bukkit.createInventory(
						new GUIIdentifier("ranksguiplugin"), ((int) (27d)),
						ChatColor.translateAlternateColorCodes('&', "&e&lRanks List"));
				guiInventory.setItem(((int) (11d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.COAL_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&7&lPulsa"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Pembayaran pulsa yang kami terima:"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &c&lCOMING SOON!"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&eKlik untuk melihat"),
								ChatColor.translateAlternateColorCodes('&', "&e")))));
				guiInventory.setItem(((int) (15d)),
						PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.EMERALD),
								ChatColor.translateAlternateColorCodes('&', "&a&lUang Digital"),
								new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
										ChatColor.translateAlternateColorCodes('&',
												"&7Pembayaran Digital yang kami terima saat ini:"),
										ChatColor.translateAlternateColorCodes('&', "&e"),
										ChatColor.translateAlternateColorCodes('&', "&7- &fDana"),
										ChatColor.translateAlternateColorCodes('&', "&7- &fOVO"),
										ChatColor.translateAlternateColorCodes('&', "&7- &fSaweria (Pajak 5%)"),
										ChatColor.translateAlternateColorCodes('&', "&e"),
										ChatColor.translateAlternateColorCodes('&', "&aKlik untuk melihat"),
										ChatColor.translateAlternateColorCodes('&', "&e")))));
				return guiInventory;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}, true);
		GUIManager.getInstance().register("belidigitalranks", guiPlayer -> {
			try {
				org.bukkit.inventory.Inventory guiInventory = Bukkit.createInventory(
						new GUIIdentifier("belidigitalranks"), ((int) (27d)),
						ChatColor.translateAlternateColorCodes('&', "&a&lDigital Payment"));
				guiInventory.setItem(((int) (11d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&aVIP"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Kelebihan &aVIP"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fPrefix &a[VIP] &fIngame"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fSpecial Discord Role"),
								ChatColor.translateAlternateColorCodes('&', "&fDan Beberapa Exclusive Fitur Lainnya!"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Ingin Beli?, harap ke discord kami"),
								ChatColor.translateAlternateColorCodes('&', "&fmythcraft.my.id/discord"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&fHarga: &a20.000"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&c&lNOTE!"),
								ChatColor.translateAlternateColorCodes('&',
										"&cMembayar via saweria akan terkena pajak"),
								ChatColor.translateAlternateColorCodes('&', "&csebesar 5%"),
								ChatColor.translateAlternateColorCodes('&', "&e")))));
				guiInventory.setItem(((int) (12d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&aVIP&e+"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Kelebihan &aVIP&e+"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fPrefix &a[VIP&e+&a] &fIngame"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fSpecial Discord Role"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fBypass Full Server"),
								ChatColor.translateAlternateColorCodes('&', "&fDan Beberapa Exclusive Fitur Lainnya!"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Ingin Beli?, harap ke discord kami"),
								ChatColor.translateAlternateColorCodes('&', "&fmythcraft.my.id/discord"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&fHarga: &a30.000"),
								ChatColor.translateAlternateColorCodes('&', "&a"),
								ChatColor.translateAlternateColorCodes('&', "&c&lNOTE!"),
								ChatColor.translateAlternateColorCodes('&',
										"&cMembayar via saweria akan terkena pajak"),
								ChatColor.translateAlternateColorCodes('&', "&csebesar 5%"),
								ChatColor.translateAlternateColorCodes('&', "&e")))));
				guiInventory.setItem(((int) (13d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&e[MYTH]"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Kelebihan &eMYTH"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fPrefix &e[MYTH] &fIngame"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fSpecial Discord Role"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fBypass Full Server"),
								ChatColor.translateAlternateColorCodes('&', "&fDan Beberapa Exclusive Fitur Lainnya!"),
								ChatColor.translateAlternateColorCodes('&', "&7- &f"),
								ChatColor.translateAlternateColorCodes('&', "&7Ingin Beli?, harap ke discord kami"),
								ChatColor.translateAlternateColorCodes('&', "&fmythcraft.my.id/discord"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&fHarga: &a50.000"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&c&lNOTE!"),
								ChatColor.translateAlternateColorCodes('&',
										"&cMembayar via saweria akan terkena pajak"),
								ChatColor.translateAlternateColorCodes('&', "&csebesar 5%"),
								ChatColor.translateAlternateColorCodes('&', "&e")))));
				guiInventory.setItem(((int) (14d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&eMYTH&c+"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Kelebihan &eMYTH&c+"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fPrefix &e[&eMYTH&c+&e] &fIngame"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fSpecial Discord Role"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fBypass Full Server"),
								ChatColor.translateAlternateColorCodes('&', "&fDan Beberapa Exclusive Fitur Lainnya!"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Ingin Beli?, harap ke discord kami"),
								ChatColor.translateAlternateColorCodes('&', "&fmythcraft.my.id/discord"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&fHarga: 80.000"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&c&lNOTE!"),
								ChatColor.translateAlternateColorCodes('&',
										"&cMembayar via saweria akan terkena pajak"),
								ChatColor.translateAlternateColorCodes('&', "&csebesar 5%"),
								ChatColor.translateAlternateColorCodes('&', "&e")))));
				guiInventory.setItem(((int) (15d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&6MYTH&c++"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Kelebihan &6MYTH&c++"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fPrefix &6[MYTH&c++&6] &fIngame"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fSpecial Discord Role"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fBypass Full Server"),
								ChatColor.translateAlternateColorCodes('&', "&fDan Beberapa Exclusive Fitur Lainnya!"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Ingin Beli?, harap ke discord kami"),
								ChatColor.translateAlternateColorCodes('&', "&fmythcraft.my.id/discord"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&fHarga: 120.000"),
								ChatColor.translateAlternateColorCodes('&', "&7")))));
				return guiInventory;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}, true);
		GUIManager.getInstance().register("digitalbeliorupdateranks", guiPlayer -> {
			try {
				org.bukkit.inventory.Inventory guiInventory = Bukkit.createInventory(
						new GUIIdentifier("digitalbeliorupdateranks"), ((int) (27d)),
						ChatColor.translateAlternateColorCodes('&', "&8Upgrade atau beli?"));
				guiInventory.setItem(((int) (11d)),
						PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.GOLD_BLOCK),
								ChatColor.translateAlternateColorCodes('&', "&eUpgrade Rank"),
								new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
										ChatColor.translateAlternateColorCodes('&', "&7Sudah Beli rank tetapi ingin"),
										ChatColor.translateAlternateColorCodes('&', "&7rank yang lebih tinggi?"),
										ChatColor.translateAlternateColorCodes('&', "&e"),
										ChatColor.translateAlternateColorCodes('&', "&aKlik untuk Upgrade"),
										ChatColor.translateAlternateColorCodes('&', "&e")))));
				guiInventory.setItem(((int) (15d)),
						PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.GOLD_BLOCK),
								ChatColor.translateAlternateColorCodes('&', "&aBeli Rank"),
								new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
										ChatColor.translateAlternateColorCodes('&', "&7Tidak punya rank dan ingin"),
										ChatColor.translateAlternateColorCodes('&', "&7Merasakan mempunyai rank?"),
										ChatColor.translateAlternateColorCodes('&', "&e"),
										ChatColor.translateAlternateColorCodes('&', "&aKlik untuk Beli"),
										ChatColor.translateAlternateColorCodes('&', "&e")))));
				return guiInventory;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}, true);
		GUIManager.getInstance().register("upgradedigitalranks", guiPlayer -> {
			try {
				org.bukkit.inventory.Inventory guiInventory = Bukkit.createInventory(
						new GUIIdentifier("upgradedigitalranks"), ((int) (27d)),
						ChatColor.translateAlternateColorCodes('&', "&eUpgrade Rank"));
				guiInventory.setItem(((int) (11d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&7Default &f-> &aVIP"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Kelebihan &aVIP"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fPrefix &a[VIP] &fIngame"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fSpecial Discord Role"),
								ChatColor.translateAlternateColorCodes('&',
										"&eDan Beberapa &e&lExclusive Fitur Lainnya!"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Ingin Beli?, harap ke discord kami"),
								ChatColor.translateAlternateColorCodes('&', "&fmythcraft.my.id/discord"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&fHarga: &a20.000"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&c&lNOTE!"),
								ChatColor.translateAlternateColorCodes('&',
										"&cMembayar via saweria akan terkena pajak"),
								ChatColor.translateAlternateColorCodes('&', "&csebesar 5%"),
								ChatColor.translateAlternateColorCodes('&', "&e")))));
				guiInventory.setItem(((int) (12d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&aVIP &f-> &aVIP&e+"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Kelebihan &aVIP&e+"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fPrefix &a[VIP&e+&a] &fIngame"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fSpecial Discord Role"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fBypass Full Server"),
								ChatColor.translateAlternateColorCodes('&',
										"&eDan Beberapa &e&lExclusive Fitur Lainnya!"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Ingin Beli?, harap ke discord kami"),
								ChatColor.translateAlternateColorCodes('&', "&fmythcraft.my.id/discord"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&fHarga: &a10000"),
								ChatColor.translateAlternateColorCodes('&', "&a"),
								ChatColor.translateAlternateColorCodes('&', "&c&lNOTE!"),
								ChatColor.translateAlternateColorCodes('&',
										"&cMembayar via saweria akan terkena pajak"),
								ChatColor.translateAlternateColorCodes('&', "&csebesar 5%"),
								ChatColor.translateAlternateColorCodes('&', "&e")))));
				guiInventory.setItem(((int) (13d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&aVIP&e+ &f-> &e[MYTH]"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Kelebihan &eMYTH"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fPrefix &e[MYTH] &fIngame"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fSpecial Discord Role"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fBypass Full Server"),
								ChatColor.translateAlternateColorCodes('&',
										"&eDan Beberapa &e&lExclusive Fitur Lainnya!"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Ingin Beli?, harap ke discord kami"),
								ChatColor.translateAlternateColorCodes('&', "&fmythcraft.my.id/discord"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&fHarga: &a20.000"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&c&lNOTE!"),
								ChatColor.translateAlternateColorCodes('&',
										"&cMembayar via saweria akan terkena pajak"),
								ChatColor.translateAlternateColorCodes('&', "&csebesar 5%"),
								ChatColor.translateAlternateColorCodes('&', "&e")))));
				guiInventory.setItem(((int) (14d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&eMYTH &f-> &eMYTH&c+"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Kelebihan &eMYTH&c+"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fPrefix &e[&eMYTH&c+&e] &fIngame"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fSpecial Discord Role"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fBypass Full Server"),
								ChatColor.translateAlternateColorCodes('&',
										"&eDan Beberapa &e&lExclusive Fitur Lainnya!"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Ingin Beli?, harap ke discord kami"),
								ChatColor.translateAlternateColorCodes('&', "&fmythcraft.my.id/discord"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&fHarga: &a30.000"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&c&lNOTE!"),
								ChatColor.translateAlternateColorCodes('&',
										"&cMembayar via saweria akan terkena pajak"),
								ChatColor.translateAlternateColorCodes('&', "&csebesar 5%"),
								ChatColor.translateAlternateColorCodes('&', "&e")))));
				guiInventory.setItem(((int) (15d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
						ChatColor.translateAlternateColorCodes('&', "&eMYTH&c+ &f->&6MYTH&c++"),
						new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Kelebihan &6MYTH&c++"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fPrefix &6[MYTH&c++&6] &fIngame"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fSpecial Discord Role"),
								ChatColor.translateAlternateColorCodes('&', "&7- &fBypass Full Server"),
								ChatColor.translateAlternateColorCodes('&',
										"&eDan Beberapa &e&lExclusive Fitur Lainnya!"),
								ChatColor.translateAlternateColorCodes('&', "&e"),
								ChatColor.translateAlternateColorCodes('&', "&7Ingin Beli?, harap ke discord kami"),
								ChatColor.translateAlternateColorCodes('&', "&fmythcraft.my.id/discord"),
								ChatColor.translateAlternateColorCodes('&', "&7"),
								ChatColor.translateAlternateColorCodes('&', "&fHarga: &a40.000 "),
								ChatColor.translateAlternateColorCodes('&', "&7")))));
				return guiInventory;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}, true);
		try {
			((org.bukkit.command.CommandSender) (Object) ((org.bukkit.command.ConsoleCommandSender) org.bukkit.Bukkit
					.getConsoleSender())).sendMessage(((java.lang.String[]) new ArrayList(
							Arrays.asList("", ChatColor.translateAlternateColorCodes('&', "&aEnabled MythRanksGui"),
									ChatColor.translateAlternateColorCodes('&',
											"&eMade By BabyRes_, also how on earth did u get this plugin?"),
									"Version 2.1Patch", "")).toArray(new java.lang.String[]{})));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		try {
			((org.bukkit.command.CommandSender) (Object) ((org.bukkit.command.ConsoleCommandSender) org.bukkit.Bukkit
					.getConsoleSender())).sendMessage(((java.lang.String[]) new ArrayList(
							Arrays.asList("", ChatColor.translateAlternateColorCodes('&', "&cDisabled MythRanksGui"),
									ChatColor.translateAlternateColorCodes('&',
											"&eMade By BabyRes_, also how on earth did u get this plugin?"),
									"Version 2.1Patch", "")).toArray(new java.lang.String[]{})));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("ranks")) {
			try {
				((org.bukkit.entity.Player) (Object) commandSender).spigot().sendMessage(
						net.md_5.bungee.api.ChatMessageType.ACTION_BAR,
						net.md_5.bungee.api.chat.TextComponent.fromLegacyText(ChatColor
								.translateAlternateColorCodes('&', "&6&l\u00BB &eOpening Rank list... &6&l\u00AB")));
				GUIManager.getInstance().open("ranksguiplugin", ((org.bukkit.entity.Player) (Object) commandSender));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
	}

	public static Object function(String function, List functionArgs) throws Exception {
		return null;
	}

	public static List createList(Object obj) {
		if (obj instanceof List) {
			return (List) obj;
		}
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@EventHandler
	public void onGUIClick(GUIClickEvent event) throws Exception {
		if (event.getID().equalsIgnoreCase("ranksguiplugin")) {
			if (PluginMain.checkEquals(((java.lang.Object) (Object) event.getSlot()),
					((java.lang.Object) (Object) (15d)))) {
				GUIManager.getInstance().open("digitalbeliorupdateranks",
						((org.bukkit.entity.Player) event.getWhoClicked()));
			}
			return;
		}
		if (event.getID().equalsIgnoreCase("digitalbeliorupdateranks")) {
			if (PluginMain.checkEquals(((java.lang.Object) (Object) event.getSlot()),
					((java.lang.Object) (Object) (11d)))) {
				GUIManager.getInstance().open("upgradedigitalranks",
						((org.bukkit.entity.Player) event.getWhoClicked()));
			}
			if (PluginMain.checkEquals(((java.lang.Object) (Object) event.getSlot()),
					((java.lang.Object) (Object) (15d)))) {
				GUIManager.getInstance().open("belidigitalranks", ((org.bukkit.entity.Player) event.getWhoClicked()));
			}
			return;
		}
	}

	public static org.bukkit.inventory.ItemStack getNamedItemWithLore(Material material, String name,
			List<String> lore) {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(material);
		org.bukkit.inventory.meta.ItemMeta itemMeta = item.getItemMeta();
		if (itemMeta != null) {
			itemMeta.setDisplayName(name);
			itemMeta.setLore(lore);
			item.setItemMeta(itemMeta);
		}
		return item;
	}

	public static boolean checkEquals(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return false;
		}
		return o1 instanceof Number && o2 instanceof Number
				? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
				: o1.equals(o2);
	}
}
