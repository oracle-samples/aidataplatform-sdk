# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CopyWorkspaceObjectDetails(object):
    """
    Details to copy a workspace object to a different location.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CopyWorkspaceObjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param from_path:
            The value to assign to the from_path property of this CopyWorkspaceObjectDetails.
        :type from_path: str

        :param to_path:
            The value to assign to the to_path property of this CopyWorkspaceObjectDetails.
        :type to_path: str

        :param is_delete_source:
            The value to assign to the is_delete_source property of this CopyWorkspaceObjectDetails.
        :type is_delete_source: bool

        :param is_over_write:
            The value to assign to the is_over_write property of this CopyWorkspaceObjectDetails.
        :type is_over_write: bool

        :param buffer_size:
            The value to assign to the buffer_size property of this CopyWorkspaceObjectDetails.
        :type buffer_size: int

        :param is_include_outputs:
            The value to assign to the is_include_outputs property of this CopyWorkspaceObjectDetails.
        :type is_include_outputs: bool

        """
        self.swagger_types = {
            'from_path': 'str',
            'to_path': 'str',
            'is_delete_source': 'bool',
            'is_over_write': 'bool',
            'buffer_size': 'int',
            'is_include_outputs': 'bool'
        }

        self.attribute_map = {
            'from_path': 'fromPath',
            'to_path': 'toPath',
            'is_delete_source': 'isDeleteSource',
            'is_over_write': 'isOverWrite',
            'buffer_size': 'bufferSize',
            'is_include_outputs': 'isIncludeOutputs'
        }

        self._from_path = None
        self._to_path = None
        self._is_delete_source = None
        self._is_over_write = None
        self._buffer_size = None
        self._is_include_outputs = None

    @property
    def from_path(self):
        """
        Gets the from_path of this CopyWorkspaceObjectDetails.
        The fully qualified path of the Workspace object that should be copied.


        :return: The from_path of this CopyWorkspaceObjectDetails.
        :rtype: str
        """
        return self._from_path

    @from_path.setter
    def from_path(self, from_path):
        """
        Sets the from_path of this CopyWorkspaceObjectDetails.
        The fully qualified path of the Workspace object that should be copied.


        :param from_path: The from_path of this CopyWorkspaceObjectDetails.
        :type: str
        """
        self._from_path = from_path

    @property
    def to_path(self):
        """
        Gets the to_path of this CopyWorkspaceObjectDetails.
        The fully qualified destination path to which the Workspace object should be copied.


        :return: The to_path of this CopyWorkspaceObjectDetails.
        :rtype: str
        """
        return self._to_path

    @to_path.setter
    def to_path(self, to_path):
        """
        Sets the to_path of this CopyWorkspaceObjectDetails.
        The fully qualified destination path to which the Workspace object should be copied.


        :param to_path: The to_path of this CopyWorkspaceObjectDetails.
        :type: str
        """
        self._to_path = to_path

    @property
    def is_delete_source(self):
        """
        Gets the is_delete_source of this CopyWorkspaceObjectDetails.
        Flag to delete the source file.


        :return: The is_delete_source of this CopyWorkspaceObjectDetails.
        :rtype: bool
        """
        return self._is_delete_source

    @is_delete_source.setter
    def is_delete_source(self, is_delete_source):
        """
        Sets the is_delete_source of this CopyWorkspaceObjectDetails.
        Flag to delete the source file.


        :param is_delete_source: The is_delete_source of this CopyWorkspaceObjectDetails.
        :type: bool
        """
        self._is_delete_source = is_delete_source

    @property
    def is_over_write(self):
        """
        Gets the is_over_write of this CopyWorkspaceObjectDetails.
        Flag to overwrite pre existing destination file.


        :return: The is_over_write of this CopyWorkspaceObjectDetails.
        :rtype: bool
        """
        return self._is_over_write

    @is_over_write.setter
    def is_over_write(self, is_over_write):
        """
        Sets the is_over_write of this CopyWorkspaceObjectDetails.
        Flag to overwrite pre existing destination file.


        :param is_over_write: The is_over_write of this CopyWorkspaceObjectDetails.
        :type: bool
        """
        self._is_over_write = is_over_write

    @property
    def buffer_size(self):
        """
        Gets the buffer_size of this CopyWorkspaceObjectDetails.
        Buffer capacity to be hold for copying file from one source to destination.


        :return: The buffer_size of this CopyWorkspaceObjectDetails.
        :rtype: int
        """
        return self._buffer_size

    @buffer_size.setter
    def buffer_size(self, buffer_size):
        """
        Sets the buffer_size of this CopyWorkspaceObjectDetails.
        Buffer capacity to be hold for copying file from one source to destination.


        :param buffer_size: The buffer_size of this CopyWorkspaceObjectDetails.
        :type: int
        """
        self._buffer_size = buffer_size

    @property
    def is_include_outputs(self):
        """
        Gets the is_include_outputs of this CopyWorkspaceObjectDetails.
        Flag to indicate whether to include cell outputs when copying a notebook file. If false, all cell outputs will be cleared. Defaults to true if not specified. Only applies to notebook files.


        :return: The is_include_outputs of this CopyWorkspaceObjectDetails.
        :rtype: bool
        """
        return self._is_include_outputs

    @is_include_outputs.setter
    def is_include_outputs(self, is_include_outputs):
        """
        Sets the is_include_outputs of this CopyWorkspaceObjectDetails.
        Flag to indicate whether to include cell outputs when copying a notebook file. If false, all cell outputs will be cleared. Defaults to true if not specified. Only applies to notebook files.


        :param is_include_outputs: The is_include_outputs of this CopyWorkspaceObjectDetails.
        :type: bool
        """
        self._is_include_outputs = is_include_outputs

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
