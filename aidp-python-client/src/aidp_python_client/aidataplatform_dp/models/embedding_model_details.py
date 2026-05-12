# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .execute_database_user_workflows_details import ExecuteDatabaseUserWorkflowsDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class EmbeddingModelDetails(ExecuteDatabaseUserWorkflowsDetails):
    """
    The embedding models which need to be enabled along with their storage location.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new EmbeddingModelDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.EmbeddingModelDetails.action_type` attribute
        of this class is ``LOAD_EMBEDDING_MODELS`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action_type:
            The value to assign to the action_type property of this EmbeddingModelDetails.
        :type action_type: str

        :param onnx_model_files:
            The value to assign to the onnx_model_files property of this EmbeddingModelDetails.
        :type onnx_model_files: str

        :param location_uri:
            The value to assign to the location_uri property of this EmbeddingModelDetails.
        :type location_uri: str

        """
        self.swagger_types = {
            'action_type': 'str',
            'onnx_model_files': 'str',
            'location_uri': 'str'
        }

        self.attribute_map = {
            'action_type': 'actionType',
            'onnx_model_files': 'onnxModelFiles',
            'location_uri': 'locationUri'
        }

        self._action_type = None
        self._onnx_model_files = None
        self._location_uri = None
        self._action_type = 'LOAD_EMBEDDING_MODELS'

    @property
    def onnx_model_files(self):
        """
        Gets the onnx_model_files of this EmbeddingModelDetails.
        CSV list of models, e.g. \"<all_MiniLM_L12_v2>,<all_MiniLM_L64_v2>\"


        :return: The onnx_model_files of this EmbeddingModelDetails.
        :rtype: str
        """
        return self._onnx_model_files

    @onnx_model_files.setter
    def onnx_model_files(self, onnx_model_files):
        """
        Sets the onnx_model_files of this EmbeddingModelDetails.
        CSV list of models, e.g. \"<all_MiniLM_L12_v2>,<all_MiniLM_L64_v2>\"


        :param onnx_model_files: The onnx_model_files of this EmbeddingModelDetails.
        :type: str
        """
        self._onnx_model_files = onnx_model_files

    @property
    def location_uri(self):
        """
        Gets the location_uri of this EmbeddingModelDetails.
        Directory for the models listed in onnxModelFiles.


        :return: The location_uri of this EmbeddingModelDetails.
        :rtype: str
        """
        return self._location_uri

    @location_uri.setter
    def location_uri(self, location_uri):
        """
        Sets the location_uri of this EmbeddingModelDetails.
        Directory for the models listed in onnxModelFiles.


        :param location_uri: The location_uri of this EmbeddingModelDetails.
        :type: str
        """
        self._location_uri = location_uri

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
