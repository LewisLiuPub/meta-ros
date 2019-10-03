# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Implement the ROS middleware interface using PrismTech OpenSplice static code generation in C++."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_opensplice"
ROS_BPN = "rmw_opensplice_cpp"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libopensplice69} \
    rcutils \
    rmw \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-generator-dds-idl \
    rosidl-typesupport-opensplice-c \
    rosidl-typesupport-opensplice-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    opensplice-cmake-module-native \
    rosidl-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libopensplice69} \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-typesupport-opensplice-c \
    rosidl-typesupport-opensplice-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    opensplice-cmake-module-native \
    rosidl-cmake-native \
"

ROS_EXEC_DEPENDS = " \
    rmw \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rmw_opensplice-release/archive/release/crystal/rmw_opensplice_cpp/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d0b0daf66b110d1dcbeec8bfd3fc730f"
SRC_URI[sha256sum] = "6d86a8b9e2e0aab9e2a58fd3eec8c9463dba0a95e21bae0ea5a9aeb9b03737d6"
S = "${WORKDIR}/rmw_opensplice-release-release-crystal-rmw_opensplice_cpp-0.6.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rmw-opensplice', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rmw-opensplice', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-opensplice/rmw-opensplice_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-opensplice/rmw-opensplice-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-opensplice/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-opensplice/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
