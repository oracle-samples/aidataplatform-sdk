# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AttachToNotebookConfig(object):
    """
    Configuration associated with the notebook being attached to the created cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AttachToNotebookConfig object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param notebook_path:
            The value to assign to the notebook_path property of this AttachToNotebookConfig.
        :type notebook_path: str

        """
        self.swagger_types = {
            'notebook_path': 'str'
        }

        self.attribute_map = {
            'notebook_path': 'notebookPath'
        }

        self._notebook_path = None

    @property
    def notebook_path(self):
        """
        **[Required]** Gets the notebook_path of this AttachToNotebookConfig.
        Notebook URI path.


        :return: The notebook_path of this AttachToNotebookConfig.
        :rtype: str
        """
        return self._notebook_path

    @notebook_path.setter
    def notebook_path(self, notebook_path):
        """
        Sets the notebook_path of this AttachToNotebookConfig.
        Notebook URI path.


        :param notebook_path: The notebook_path of this AttachToNotebookConfig.
        :type: str
        """
        self._notebook_path = notebook_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
