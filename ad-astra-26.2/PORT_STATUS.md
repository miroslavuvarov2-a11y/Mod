# Ad Astra 26.2 port

Source input:
- ad_astra-forge-1.20.1-1.15.21.jar
- 556 class files
- Forge 47.x / Minecraft 1.20.1

Target:
- Minecraft 26.2
- NeoForge 26.2.0.88
- Java 25

## Current stage
1. 26.2 NeoForge project scaffold created.
2. Original JAR inspected and package layout recorded.
3. Migration target switched from legacy Forge API to current NeoForge API.
4. Full code/resource migration is next.

## Important
This is a source-port project, not a version-number-only repack. Registries, events, networking, data components, dimensions/worldgen, rendering, menus, entities and mixins need API migration.

The original Ad Astra license and attribution must remain with the port.
