[![Curse Forge](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/curseforge_vector.svg)](https://www.curseforge.com/minecraft/mc-mods/red-core)
[![Modrinth](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg)](https://modrinth.com/mod/red-core)

[![Buy Me a Coffee](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/donate/buymeacoffee-singular_vector.svg)](https://www.buymeacoffee.com/desoroxxx)
[![Discord](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/social/discord-plural_vector.svg)](https://discord.gg/hKpUYx7VwS)

[![Java 8](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/built-with/java8_vector.svg)](https://adoptium.net/temurin/releases/?version=8)
[![Gradle](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/built-with/gradle_vector.svg)](https://gradle.org/)
[![Forge](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/supported/forge_vector.svg)](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.12.2.html)

![Red Core Banner with Background Rounded](https://github.com/Red-Studio-Ragnarok/Red-Core/assets/82710983/6a52753f-a693-4d1b-9696-20619eb8d828)

Red Core is the foundational library for Red Studio projects and associated projects.

## Features

- **RedLogger:** A user and dev-friendly logger, useful for errors and crash logging when lots of information is needed.
- **Vectors:** A fast and simple vector suite, for every Java primitive.
- **MathUtil:** A utility class which provides nice to have math-related methods.
- **ClampUtil:** A utility class which provides fast biased clamping for every primitive, and testers to know exactly which end to bias towards.
- **[Jafama]:** Red Core embeds [Jafama] allowing you to use it in your mods.

[Jafama]: https://github.com/jeffhain/jafama

### Minecraft Specific Features

- **RedClientTicker:** A client ticker which provides slower ticking methods for things that don't require updating 20 times per second.
- **NetworkUtil:** A utility class which makes networking easier, safer, and cleaner.
- **OptiNotFine:** A utility class which allows you to easily know if OptiFine is installed, forces off specific OptiFine features, and also allows you to know if shaders are enabled.
- **RedLoadingPlugin:** An abstract class which you can extend instead of implementing `IFMLLoadingPlugin`, it implements the standard stub methods for you.

## Why Red Core?

Red Core is used in most projects Red Studio is involved in, it aims at reducing redundant code amongst projects and making it easier to do a plethora of things.

Red Core aims to have great Markdown Javadoc's and comments, so you can know what something does without leaving your IDE.

Red Core is always evolving, and you can help; pull requests and feature requests are very welcome.

## How to Integrate Red Core into Your Project?

First, add the Red Studio repository to your build.gradle.kts file:

```kotlin
repositories {
	arrayOf("Release", "Beta", "Dev").forEach { repoType ->
		maven {
			name = "Red Studio - $repoType"
			url = uri("https://repo.redstudio.dev/${repoType.lowercase()}")
			content {
				includeGroup("dev.redstudio")
			}
		}
	}
}
```

### Red Core

Then for Red Core itself, add the dependency (this example is for 0.7):
```kotlin
dependencies {
    implementation("dev.redstudio:Red-Core:0.7")
}
```

### Red Core MC

If you want to use Red Core's Minecraft-specific features, add the dependency (this example is for 0.7):
```kotlin
dependencies {
    implementation("dev.redstudio:Red-Core-MC:1.8-1.12-0.7")
}
```
---

[![BisectHostingPromoBanner](https://github.com/user-attachments/assets/8e66200c-1a7c-4f0a-a12a-387bf7d7f0f6)](https://bisecthosting.com/Desoroxxx?r=Red+Core+GitHub)

# Want to have your own mod or support me?

If you're looking for a mod but don't have the development skills or time, consider commissioning me!
My commissions are currently open, and I’d be happy to create a custom mod to fit your needs as long as you provide assets.

[Commissions](https://www.buymeacoffee.com/desoroxxx/commissions)

You can also support me on a monthly basis by becoming a member.
To thank you, you’ll have the possibility to access exclusive post and messages, Discord channel for WIP content, and even access to unreleased Prototypes or WIP Projects.

[Membership](https://www.buymeacoffee.com/desoroxxx/membership)

You can also [buy me a hot chocolate](https://www.buymeacoffee.com/desoroxxx).
