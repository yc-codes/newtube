# Player and navigation icons

The player and navigation share a 24-unit icon grid with rounded corners and
heavier outlines. Existing Home and Subscriptions icons already follow this
direction and retain their selected/idle variants. Downloads and You now use
matching rounded selected/idle variants.

The reference for this refresh is Aaron La Lau and Marshall Bock's 2025
[YouTube Symbols showcase](https://lalau.ca/projects/ytsymbols.html), specifically
the [published after sheet](https://lalau.ca/img/ytsymbols/icons-after.svg).
Settings, Search, Speed, Captions, Queue, Shuffle, Volume, and the idle Downloads,
History, and You symbols are adapted from that sheet. Android vector groups
translate each symbol from the sheet into the local 24-unit viewport.
Transport, fullscreen, back, PiP, and selected-state companions use matching
rounded geometry. These are a mixture of reference adaptations and companion
drawings, rather than an export of every icon from a particular Android APK.

The play/pause static vectors and the two path strings in `player_glyphs.xml`
must remain identical. Their two subpaths have matching command sequences so
the existing animated vector transitions interpolate without changing shape
when the animation finishes.

The launcher remains the NewTube arch. Upstream PR #133's optional YouTube
launcher identity has not been imported.

## Speed shortcut

Settings → Playback → **Speed button in player** controls the shortcut in the
player's options row. It defaults to enabled, displays the remembered playback
rate, and opens the existing speed sheet. The setting uses the private
`newtube_player_controls` preferences file. Returning from Settings or showing
the controls refreshes its visibility; player speed changes refresh its label.
The title reserves the options row's measured width, including when the shortcut
is hidden. The gear menu's speed row remains available.
