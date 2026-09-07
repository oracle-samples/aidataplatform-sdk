# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ComputeConfigurationLibraryEntry(object):
    """
    A cluster-scoped library entry in the Compute configuration YAML.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ComputeConfigurationLibraryEntry object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this ComputeConfigurationLibraryEntry.
        :type path: str

        :param pip:
            The value to assign to the pip property of this ComputeConfigurationLibraryEntry.
        :type pip: str

        :param jar:
            The value to assign to the jar property of this ComputeConfigurationLibraryEntry.
        :type jar: str

        """
        self.swagger_types = {
            'path': 'str',
            'pip': 'str',
            'jar': 'str'
        }

        self.attribute_map = {
            'path': 'path',
            'pip': 'pip',
            'jar': 'jar'
        }

        self._path = None
        self._pip = None
        self._jar = None

    @property
    def path(self):
        """
        Gets the path of this ComputeConfigurationLibraryEntry.
        Workspace or volume path containing library configuration.


        :return: The path of this ComputeConfigurationLibraryEntry.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this ComputeConfigurationLibraryEntry.
        Workspace or volume path containing library configuration.


        :param path: The path of this ComputeConfigurationLibraryEntry.
        :type: str
        """
        self._path = path

    @property
    def pip(self):
        """
        Gets the pip of this ComputeConfigurationLibraryEntry.
        Python package identifier.


        :return: The pip of this ComputeConfigurationLibraryEntry.
        :rtype: str
        """
        return self._pip

    @pip.setter
    def pip(self, pip):
        """
        Sets the pip of this ComputeConfigurationLibraryEntry.
        Python package identifier.


        :param pip: The pip of this ComputeConfigurationLibraryEntry.
        :type: str
        """
        self._pip = pip

    @property
    def jar(self):
        """
        Gets the jar of this ComputeConfigurationLibraryEntry.
        JAR coordinate or workspace/volume path.


        :return: The jar of this ComputeConfigurationLibraryEntry.
        :rtype: str
        """
        return self._jar

    @jar.setter
    def jar(self, jar):
        """
        Sets the jar of this ComputeConfigurationLibraryEntry.
        JAR coordinate or workspace/volume path.


        :param jar: The jar of this ComputeConfigurationLibraryEntry.
        :type: str
        """
        self._jar = jar

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
