# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class MoveWorkspaceObjectDetails(object):
    """
    Details to move a workspace object to a different location.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new MoveWorkspaceObjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param from_path:
            The value to assign to the from_path property of this MoveWorkspaceObjectDetails.
        :type from_path: str

        :param to_path:
            The value to assign to the to_path property of this MoveWorkspaceObjectDetails.
        :type to_path: str

        """
        self.swagger_types = {
            'from_path': 'str',
            'to_path': 'str'
        }

        self.attribute_map = {
            'from_path': 'fromPath',
            'to_path': 'toPath'
        }

        self._from_path = None
        self._to_path = None

    @property
    def from_path(self):
        """
        Gets the from_path of this MoveWorkspaceObjectDetails.
        The fully qualified path of the workspace object that should be moved.


        :return: The from_path of this MoveWorkspaceObjectDetails.
        :rtype: str
        """
        return self._from_path

    @from_path.setter
    def from_path(self, from_path):
        """
        Sets the from_path of this MoveWorkspaceObjectDetails.
        The fully qualified path of the workspace object that should be moved.


        :param from_path: The from_path of this MoveWorkspaceObjectDetails.
        :type: str
        """
        self._from_path = from_path

    @property
    def to_path(self):
        """
        Gets the to_path of this MoveWorkspaceObjectDetails.
        The fully qualified destination path to which the Workspace object should be moved.


        :return: The to_path of this MoveWorkspaceObjectDetails.
        :rtype: str
        """
        return self._to_path

    @to_path.setter
    def to_path(self, to_path):
        """
        Sets the to_path of this MoveWorkspaceObjectDetails.
        The fully qualified destination path to which the Workspace object should be moved.


        :param to_path: The to_path of this MoveWorkspaceObjectDetails.
        :type: str
        """
        self._to_path = to_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
