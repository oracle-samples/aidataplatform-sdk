# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClearOutputsDetails(object):
    """
    Payload required to clear outputs of a notebook file.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ClearOutputsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param should_clear_exec_metadata:
            The value to assign to the should_clear_exec_metadata property of this ClearOutputsDetails.
        :type should_clear_exec_metadata: bool

        """
        self.swagger_types = {
            'should_clear_exec_metadata': 'bool'
        }

        self.attribute_map = {
            'should_clear_exec_metadata': 'shouldClearExecMetadata'
        }

        self._should_clear_exec_metadata = None

    @property
    def should_clear_exec_metadata(self):
        """
        Gets the should_clear_exec_metadata of this ClearOutputsDetails.
        To clear execution metadata like execution count, command_metadata etc.


        :return: The should_clear_exec_metadata of this ClearOutputsDetails.
        :rtype: bool
        """
        return self._should_clear_exec_metadata

    @should_clear_exec_metadata.setter
    def should_clear_exec_metadata(self, should_clear_exec_metadata):
        """
        Sets the should_clear_exec_metadata of this ClearOutputsDetails.
        To clear execution metadata like execution count, command_metadata etc.


        :param should_clear_exec_metadata: The should_clear_exec_metadata of this ClearOutputsDetails.
        :type: bool
        """
        self._should_clear_exec_metadata = should_clear_exec_metadata

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
