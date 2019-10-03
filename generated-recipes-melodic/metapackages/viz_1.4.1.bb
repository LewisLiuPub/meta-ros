# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "https://github.com/ros/metapackages"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "metapackages"
ROS_BPN = "viz"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros-base \
    rqt-common-plugins \
    rqt-robot-plugins \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/melodic/viz/1.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "61ed77572639070a13be1a1a67c4daf2"
SRC_URI[sha256sum] = "c2cdc23508adf393957c192b8d62b0278260342d34dbcc58a3bac3abbd61dcf4"
S = "${WORKDIR}/metapackages-release-release-melodic-viz-1.4.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('metapackages', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('metapackages', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/metapackages/metapackages_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/metapackages/metapackages-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/metapackages/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/metapackages/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}