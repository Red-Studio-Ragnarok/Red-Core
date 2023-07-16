# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project follows to [Ragnarök Versioning Convention](https://shor.cz/ragnarok_versioning_convention).

## [Unreleased] Red Core Version 0.3 Changelog

### Changed

- RedLogger now uses a String instead of a URI for the `newIssueLink` parameter, the old constructor has been deprecated and is due for removal for 0.4
- RedLogger recomfort messages might be more random
### Optimized

- Optimized `RedLogger#printFramedError` it should now use slightly less memory and thus have less GC pressure

---

## Red Core Version 0.2 Changelog - 2023-6-13

### Added

- **MathUtil:** A purpose-built class providing an array of mathematical methods, engineered with a steadfast focus on rapid processing and calculations.
- **Vectors:** A comprehensive and efficient suite of vectors, designed with performance and simplicity in mind.
- **RedLogger:** An advanced error logger engineered to make error logging and understanding significantly more user-friendly.
- **Included [Jafama](https://github.com/jeffhain/jafama)**: A high-performance math library now incorporated within the Red Core, for better compatibility between mods.
- **Stopwatch Enhancements:** The Stopwatch feature now boasts the ability to output results directly to a file, in addition to averaging all these results for comprehensive analysis.

### Changed

- Renamed the `Chronometer` component to the more intuitive `Stopwatch` for improved user understanding.
- The Stopwatch feature has been refined to display outputs in milliseconds, accurate up to two decimal places.

