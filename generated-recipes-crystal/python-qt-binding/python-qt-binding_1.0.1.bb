# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This stack provides Python bindings for Qt.     There are two providers: pyside and pyqt.  PySide2 is available under     the GPL, LGPL and a commercial license.  PyQt is released under the GPL.      Both the bindings and tools to build bindings are included from each     available provider.  For PySide, it is called &quot;Shiboken&quot;.  For PyQt,     this is called &quot;SIP&quot;.      Also provided is adapter code to make the user's Python code     independent of which binding provider was actually used which makes     it very easy to switch between these."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Dave Hershberger"
HOMEPAGE = "http://ros.org/wiki/python_qt_binding"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=ced11b5ec2a0776fd01740115328457b"

ROS_CN = "python_qt_binding"
ROS_BPN = "python_qt_binding"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python3-qt5-bindings} \
    qtbase \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python3-qt5-bindings} \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/python_qt_binding-release/archive/release/crystal/python_qt_binding/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "45ea8b8124e31c966277b729b949c7ff"
SRC_URI[sha256sum] = "fdf6f093e4849aba0695f6fa8c9bbe628d7da9b9745f7274b0fcc5e004cd0b08"
S = "${WORKDIR}/python_qt_binding-release-release-crystal-python_qt_binding-1.0.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('python-qt-binding', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('python-qt-binding', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/python-qt-binding/python-qt-binding_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/python-qt-binding/python-qt-binding-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/python-qt-binding/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/python-qt-binding/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
