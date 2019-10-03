# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "jsk_interactive_test"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Kei Okada"
HOMEPAGE = "http://ros.org/wiki/jsk_interactive_test"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_visualization"
ROS_BPN = "jsk_interactive_test"

ROS_BUILD_DEPENDS = " \
    jsk-interactive \
    jsk-interactive-marker \
    mk \
    rosbuild \
    rospy \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    jsk-interactive \
    jsk-interactive-marker \
    rospy \
    rviz \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    jsk-interactive \
    jsk-interactive-marker \
    rospy \
    rviz \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_interactive_test/2.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "55ca6bec7123c78e47fc5d1fe60f973b"
SRC_URI[sha256sum] = "5f1a01af87786761626dae0bf1e263553bcdf2e57234cbe55f1273dc523d1104"
S = "${WORKDIR}/jsk_visualization-release-release-melodic-jsk_interactive_test-2.1.5-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('jsk-visualization', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('jsk-visualization', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-visualization/jsk-visualization_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-visualization/jsk-visualization-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-visualization/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-visualization/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}