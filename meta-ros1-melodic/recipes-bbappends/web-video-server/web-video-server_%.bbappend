# Copyright (c) 2019-2020 LG Electronics, Inc.

# Depends on ffmpeg with this restriction:
LICENSE_FLAGS = "commercial"

# Depends on gstreamer1.0-* with this restriction:
inherit distro_features_check
REQUIRED_DISTRO_FEATURES_append_rpi = " opengl"