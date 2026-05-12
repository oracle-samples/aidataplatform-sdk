# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .dependency import Dependency
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FileDependency(Dependency):
    """
    File dependency. Represents a file or library.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new FileDependency object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.FileDependency.type` attribute
        of this class is ``FILE`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this FileDependency.
            Allowed values for this property are: "FILE", "COMPUTE", "JOB"
        :type type: str

        :param path:
            The value to assign to the path property of this FileDependency.
        :type path: str

        """
        self.swagger_types = {
            'type': 'str',
            'path': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'path': 'path'
        }

        self._type = None
        self._path = None
        self._type = 'FILE'

    @property
    def path(self):
        """
        Gets the path of this FileDependency.
        File path or library name.


        :return: The path of this FileDependency.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this FileDependency.
        File path or library name.


        :param path: The path of this FileDependency.
        :type: str
        """
        self._path = path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
