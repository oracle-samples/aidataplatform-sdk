# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FileConfiguration(object):
    """
    File read/write configuration for an agent flow session. DataHub owns this
    as Agent Flow authoring metadata and passes it to downstream runtime
    components as structured JSON. Runtime and gateway components enforce
    file policy during session execution.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new FileConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_enabled:
            The value to assign to the is_enabled property of this FileConfiguration.
        :type is_enabled: bool

        :param read:
            The value to assign to the read property of this FileConfiguration.
        :type read: oci.aidataplatform_dp.models.FileReadConfiguration

        :param write:
            The value to assign to the write property of this FileConfiguration.
        :type write: oci.aidataplatform_dp.models.FileWriteConfiguration

        """
        self.swagger_types = {
            'is_enabled': 'bool',
            'read': 'FileReadConfiguration',
            'write': 'FileWriteConfiguration'
        }

        self.attribute_map = {
            'is_enabled': 'isEnabled',
            'read': 'read',
            'write': 'write'
        }

        self._is_enabled = None
        self._read = None
        self._write = None

    @property
    def is_enabled(self):
        """
        Gets the is_enabled of this FileConfiguration.
        Overall preview/codegen gate for runtime session-file helper tools.


        :return: The is_enabled of this FileConfiguration.
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """
        Sets the is_enabled of this FileConfiguration.
        Overall preview/codegen gate for runtime session-file helper tools.


        :param is_enabled: The is_enabled of this FileConfiguration.
        :type: bool
        """
        self._is_enabled = is_enabled

    @property
    def read(self):
        """
        Gets the read of this FileConfiguration.

        :return: The read of this FileConfiguration.
        :rtype: oci.aidataplatform_dp.models.FileReadConfiguration
        """
        return self._read

    @read.setter
    def read(self, read):
        """
        Sets the read of this FileConfiguration.

        :param read: The read of this FileConfiguration.
        :type: oci.aidataplatform_dp.models.FileReadConfiguration
        """
        self._read = read

    @property
    def write(self):
        """
        Gets the write of this FileConfiguration.

        :return: The write of this FileConfiguration.
        :rtype: oci.aidataplatform_dp.models.FileWriteConfiguration
        """
        return self._write

    @write.setter
    def write(self, write):
        """
        Sets the write of this FileConfiguration.

        :param write: The write of this FileConfiguration.
        :type: oci.aidataplatform_dp.models.FileWriteConfiguration
        """
        self._write = write

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
