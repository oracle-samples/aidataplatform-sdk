# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RenameWorkspaceObjectDetails(object):
    """
    Details to rename a workspace object.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RenameWorkspaceObjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this RenameWorkspaceObjectDetails.
        :type path: str

        :param new_name:
            The value to assign to the new_name property of this RenameWorkspaceObjectDetails.
        :type new_name: str

        """
        self.swagger_types = {
            'path': 'str',
            'new_name': 'str'
        }

        self.attribute_map = {
            'path': 'path',
            'new_name': 'newName'
        }

        self._path = None
        self._new_name = None

    @property
    def path(self):
        """
        Gets the path of this RenameWorkspaceObjectDetails.
        The fully qualified path of the Workspace object that should be renamed.


        :return: The path of this RenameWorkspaceObjectDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this RenameWorkspaceObjectDetails.
        The fully qualified path of the Workspace object that should be renamed.


        :param path: The path of this RenameWorkspaceObjectDetails.
        :type: str
        """
        self._path = path

    @property
    def new_name(self):
        """
        Gets the new_name of this RenameWorkspaceObjectDetails.
        The new name of the workspace object.


        :return: The new_name of this RenameWorkspaceObjectDetails.
        :rtype: str
        """
        return self._new_name

    @new_name.setter
    def new_name(self, new_name):
        """
        Sets the new_name of this RenameWorkspaceObjectDetails.
        The new name of the workspace object.


        :param new_name: The new_name of this RenameWorkspaceObjectDetails.
        :type: str
        """
        self._new_name = new_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
