// $Id$
/*
 * WorldGuard
 * Copyright (C) 2010 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldguard.bukkit;

import org.bukkit.event.server.PluginEvent;
import org.bukkit.event.server.ServerListener;

import com.nijiko.iConomy.configuration.PropertyHandler;
import com.nijikokun.bukkit.iConomy.iConomy;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

/**
 * 
 * @author DarkLiKally
 */
public class WorldGuardServerListener extends ServerListener {
    /**
     * Plugin.
     */
    private WorldGuardPlugin plugin;

    /**
     * Construct the object;
     * 
     * @param plugin
     */
    public WorldGuardServerListener(WorldGuardPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void onPluginEnabled(PluginEvent event) {
        if(event.getPlugin().getDescription().getName().equals("iConomy")) {
            WorldGuardPlugin.iConomy = (iConomy)event.getPlugin();
        }
    }
}