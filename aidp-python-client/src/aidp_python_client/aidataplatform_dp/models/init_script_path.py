# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InitScriptPath(object):
    """
    The path details of init script.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new InitScriptPath object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param destination:
            The value to assign to the destination property of this InitScriptPath.
        :type destination: str

        """
        self.swagger_types = {
            'destination': 'str'
        }

        self.attribute_map = {
            'destination': 'destination'
        }

        self._destination = None

    @property
    def destination(self):
        """
        **[Required]** Gets the destination of this InitScriptPath.
        Full path of the init script file. Example - /Workspace/Shared/Folder1/my-init.sh or /Volumes/catalogName/schemaName/volumeName/Shared/Folder1/my-init.sh.


        :return: The destination of this InitScriptPath.
        :rtype: str
        """
        return self._destination

    @destination.setter
    def destination(self, destination):
        """
        Sets the destination of this InitScriptPath.
        Full path of the init script file. Example - /Workspace/Shared/Folder1/my-init.sh or /Volumes/catalogName/schemaName/volumeName/Shared/Folder1/my-init.sh.


        :param destination: The destination of this InitScriptPath.
        :type: str
        """
        self._destination = destination

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
