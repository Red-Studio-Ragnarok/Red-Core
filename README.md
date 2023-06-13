[![Curse Forge](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/curseforge_vector.svg)](https://www.curseforge.com/minecraft/mc-mods/red-core)
[![Modrinth](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg)](https://modrinth.com/mod/red-core)

[![Buy Me a Coffee](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/donate/buymeacoffee-singular_vector.svg)](https://www.buymeacoffee.com/desoroxxx)
[![Discord](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/social/discord-plural_vector.svg)](https://discord.gg/hKpUYx7VwS)

[![Java 8](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/built-with/java8_vector.svg)](https://adoptium.net/temurin/releases/?version=8)
[![Gradle](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/built-with/gradle_vector.svg)](https://gradle.org/)
[![Forge](https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/supported/forge_vector.svg)](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.12.2.html)

# Red-Core

Red-Core is the foundational framework for Red Studio projects and associated projects. It features robust development utilities, streamlined error logging, and a high-speed, clean vectors' suite.

## Features

- **RedLogger:** A powerful error logger that makes logging error cleaner and easier to understand for users
- **Vectors:** A complete suite of vectors they are fast and clean, new features are added to them when needed
- **MathUtil** A class that provides mathematical methods, with an emphasis on speed.
- **Stopwatch:** A stopwatch targeted at profiling, my attempt at jumping in the overgrowing list of stopwatch made in Java

## Why Red-Core?

Red-Core sits at the heart of Red Studio's Minecraft 1.12 mods, aiming to make your mod development process more efficient. By providing a set of tailored tools and libraries, we allow you to focus more on designing exciting mods and less on the intricacies of development.

What sets us apart is our comprehensive Javadoc documentation. We believe good documentation is the cornerstone of effective development. Every method in Red-Core comes with detailed Javadoc comments, making the technical information and guidance you need just a ctrl-click away.

Join us in enhancing Red-Core! We believe in constant evolution and the power of community-driven development. Whether you're a contributor or a user in the Minecraft modding community, your experience matters. We're here to ensure it's the best it can be.

## How to Integrate Red-Core into Your Project?

Integrating Red-Core into your project is a straightforward process that involves tweaking your Gradle build script. Follow the steps below:

1. **Add a New Configuration:** Start by adding a new configuration to your Gradle build script, which will be used to download and attach sources.

    ```groovy
    configurations {
        // Define a configuration to download and attach sources
        sources
    }
    ```

2. **Add the Ivy Repository:** Next, add the Ivy repository to your list of repositories.

    ```groovy
    repositories {
        ivy {
            name 'Red Studio GitHub Releases'
            url 'https://github.com/'

            patternLayout { artifact '[organisation]/[module]/releases/download/[revision]/[module]-[revision](-[classifier]).[ext]' }

            metadataSources { artifact() }
        }
    }
    ```

3. **Add Dependencies:** Lastly, include Red-Core in your dependencies. Make sure to replace the version number (0.2 in this case) with the desired Red-Core version.

    ```groovy
    dependencies {
        implementation 'Red-Studio-Ragnarok:Red-Core:0.2'
        sources 'Red-Studio-Ragnarok:Red-Core:0.2:sources@jar'
    }
    ```

And there you have it! Red-Core is now integrated into your project and ready to use.

## Want to have your own mod or support me?

If you're looking for a mod but don't have the development skills or time, consider commissioning me!
My commissions are currently open and I would be happy to create a custom mod to fit your needs as long as you provide assets.

[Commissions]

You can also support me on a monthly basis by becoming a member.
To thank you will have the possibility to access exlcusive post and messages, Discord channel for WIP content, and even access to unreleased Prototypes or WIP Projects.

[Membership]

You can also [buy me a hot chocolate].

[Commissions]: https://www.buymeacoffee.com/desoroxxx/commissions
[Membership]: https://www.buymeacoffee.com/desoroxxx/membership
[buy me a hot chocolate]: https://www.buymeacoffee.com/desoroxxx
