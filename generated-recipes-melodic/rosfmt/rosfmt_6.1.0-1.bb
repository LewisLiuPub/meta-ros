# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "fmt is an open-source formatting library for C++. 		It can be used as a safe and fast alternative to (s)printf and IOStreams."
AUTHOR = "Max Schwarz <max.schwarz@ais.uni-bonn.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=75730354549103aaba72b66caf53717b"

ROS_CN = "rosfmt"
ROS_BPN = "rosfmt"

ROS_BUILD_DEPENDS = " \
    rosconsole \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rosconsole \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosconsole \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/xqms/rosfmt-release/archive/release/melodic/rosfmt/6.1.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "41d4f01a334eb428a8f76ef4d9e3eb54"
SRC_URI[sha256sum] = "8863afa48a520a2e262575c5a650c6258e5da038400063889cc44ef42bfcce3d"
S = "${WORKDIR}/rosfmt-release-release-melodic-rosfmt-6.1.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosfmt', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosfmt', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosfmt/rosfmt_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosfmt/rosfmt-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosfmt/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosfmt/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}