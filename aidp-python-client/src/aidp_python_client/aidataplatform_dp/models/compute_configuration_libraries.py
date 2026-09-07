# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ComputeConfigurationLibraries(object):
    """
    Cluster-scoped libraries configured on Spark Compute.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ComputeConfigurationLibraries object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param python:
            The value to assign to the python property of this ComputeConfigurationLibraries.
        :type python: list[str]

        :param jars:
            The value to assign to the jars property of this ComputeConfigurationLibraries.
        :type jars: list[str]

        """
        self.swagger_types = {
            'python': 'list[str]',
            'jars': 'list[str]'
        }

        self.attribute_map = {
            'python': 'python',
            'jars': 'jars'
        }

        self._python = None
        self._jars = None

    @property
    def python(self):
        """
        Gets the python of this ComputeConfigurationLibraries.
        Python package identifiers and workspace or volume paths.


        :return: The python of this ComputeConfigurationLibraries.
        :rtype: list[str]
        """
        return self._python

    @python.setter
    def python(self, python):
        """
        Sets the python of this ComputeConfigurationLibraries.
        Python package identifiers and workspace or volume paths.


        :param python: The python of this ComputeConfigurationLibraries.
        :type: list[str]
        """
        self._python = python

    @property
    def jars(self):
        """
        Gets the jars of this ComputeConfigurationLibraries.
        JAR coordinates and workspace or volume paths.


        :return: The jars of this ComputeConfigurationLibraries.
        :rtype: list[str]
        """
        return self._jars

    @jars.setter
    def jars(self, jars):
        """
        Sets the jars of this ComputeConfigurationLibraries.
        JAR coordinates and workspace or volume paths.


        :param jars: The jars of this ComputeConfigurationLibraries.
        :type: list[str]
        """
        self._jars = jars

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
